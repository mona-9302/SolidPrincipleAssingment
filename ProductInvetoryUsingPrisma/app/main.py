from fastapi import FastAPI
from app.router import company_router, category_router, product_router

app = FastAPI(title="FastAPI Prisma CRUD - MySQL Example")

# ✅ Routers include
app.include_router(company_router.router)
app.include_router(category_router.router)
app.include_router(product_router.router)


# ✅ Root endpoint
@app.get("/")
def root():
    return {"message": "Welcome to FastAPI + Prisma + MySQL CRUD API!"}
