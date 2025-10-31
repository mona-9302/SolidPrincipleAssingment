from pydantic import BaseModel
from typing import Optional


# ✅ Request Schema
class ProductCreate(BaseModel):
    name: str
    price: int
    company_id: int
    category_id: int


# ✅ Response Schema
class ProductResponse(BaseModel):
    id: int
    name: str
    price: int
    company_id: int
    category_id: int

    class Config:
        orm_mode = True
