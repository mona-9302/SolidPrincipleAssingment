from app.database.database import Base, engine
from app.model import Company, Category, Product
from app.router import company_router
from app.router import category_router
from fastapi import FastAPI
from app.router import product_router

# print("Creating tables...")
# Base.metadata.create_all(bind=engine)
# print("✅ Tables created successfully!")

app = FastAPI()

app.include_router(company_router.router)

app.include_router(category_router.router)

app.include_router(product_router.router)
