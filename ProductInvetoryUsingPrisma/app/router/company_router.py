from fastapi import APIRouter, HTTPException
from app.schema.company_schema import CompanyCreate, CompanyResponse
from app.crud import company_crud

router = APIRouter(prefix="/companies", tags=["Companies"])


# ✅ Create Company
@router.post("/", response_model=CompanyResponse)
async def create_company(data: CompanyCreate):
    company = await company_crud.create_company(data)
    return company


# ✅ Get All Companies
@router.get("/", response_model=list[CompanyResponse])
async def get_companies():
    companies = await company_crud.get_all_companies()
    return companies


# ✅ Get Company by ID
@router.get("/{company_id}", response_model=CompanyResponse)
async def get_company(company_id: int):
    company = await company_crud.get_company_by_id(company_id)
    if not company:
        raise HTTPException(status_code=404, detail="Company not found")
    return company


# ✅ Update Company
@router.put("/{company_id}", response_model=CompanyResponse)
async def update_company(company_id: int, data: CompanyCreate):
    updated = await company_crud.update_company(company_id, data)
    if not updated:
        raise HTTPException(status_code=404, detail="Company not found")
    return updated


# ✅ Delete Company
@router.delete("/{company_id}")
async def delete_company(company_id: int):
    deleted = await company_crud.delete_company(company_id)
    if not deleted:
        raise HTTPException(status_code=404, detail="Company not found")
    return {"message": "Company deleted successfully"}
