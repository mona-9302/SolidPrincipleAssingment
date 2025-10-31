# app/routers/client_routes.py
import pandas as pd
from fastapi import APIRouter, UploadFile, File, HTTPException, Depends, Query
from fastapi.responses import StreamingResponse
from io import BytesIO
from prisma import Prisma
from app.schemas.client_schema import ClientCreate
from app.core.database import get_prisma

router = APIRouter(prefix="/clients", tags=["Clients"])

# ✅ 1️⃣ Upload CSV and insert records into DB
@router.post("/upload")
async def upload_csv(file: UploadFile = File(...), prisma: Prisma = Depends(get_prisma)):
    if not file.filename.endswith(".csv"):
        raise HTTPException(status_code=400, detail="Please upload a valid CSV file.")

    # Read CSV using pandas
    df = pd.read_csv(file.file)

    required_cols = {"name", "email", "about"}
    if not required_cols.issubset(df.columns):
        raise HTTPException(status_code=400, detail="CSV must contain columns: name, email, about")

    # Insert each record into DB
    records = []
    for _, row in df.iterrows():
        data = {
            "name": str(row["name"]),
            "email": str(row["email"]),
            "about": str(row["about"]) if not pd.isna(row["about"]) else None
        }
        try:
            record = await prisma.client.create(data=data)
            records.append(record)
        except Exception as e:
            print(f"Skipping duplicate or invalid record: {e}")

    return {"message": f"{len(records)} records inserted successfully."}


# ✅ 2️⃣ Add client manually through JSON input
@router.post("/add")
async def add_client(client: ClientCreate, prisma: Prisma = Depends(get_prisma)):
    try:
        record = await prisma.client.create(data=client.dict())
        return {"message": "Client added successfully", "data": record.dict()}
    except Exception as e:
        raise HTTPException(status_code=400, detail=f"Error: {e}")


# ✅ 3️⃣ Download data as CSV or XLSX
@router.get("/export")
async def export_data(
    format: str = Query("csv", enum=["csv", "xlsx"]),
    limit: int = Query(None, description="Number of rows to download (optional)"),
    prisma: Prisma = Depends(get_prisma)
):
    clients = await prisma.client.find_many(take=limit)
    if not clients:
        raise HTTPException(status_code=404, detail="No client data found")

    df = pd.DataFrame([c.dict() for c in clients])

    if format == "csv":
        stream = BytesIO()
        df.to_csv(stream, index=False)
        stream.seek(0)
        headers = {"Content-Disposition": "attachment; filename=clients.csv"}
        return StreamingResponse(stream, media_type="text/csv", headers=headers)

    elif format == "xlsx":
        stream = BytesIO()
        df.to_excel(stream, index=False, engine="openpyxl")
        stream.seek(0)
        headers = {"Content-Disposition": "attachment; filename=clients.xlsx"}
        return StreamingResponse(stream, media_type="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", headers=headers)
