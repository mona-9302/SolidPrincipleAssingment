# app/main.py
from fastapi import FastAPI
from app.routers import client_routes
from app.core.database import connect_db, disconnect_db

# ✅ Create FastAPI app instance
app = FastAPI(
    title="File Handling & Data Operations API",
    description="API for CSV upload, manual add, and export using FastAPI + Prisma ORM",
    version="1.0.0"
)

# ✅ Include routers
app.include_router(client_routes.router)

# ✅ Startup event - connect Prisma DB
@app.on_event("startup")
async def startup():
    await connect_db()

# ✅ Shutdown event - disconnect Prisma DB
@app.on_event("shutdown")
async def shutdown():
    await disconnect_db()

# ✅ Root endpoint
@app.get("/")
async def root():
    return {"message": "Welcome to File Handling API using FastAPI + Prisma ORM"}
