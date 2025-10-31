from pydantic import BaseModel
from typing import Optional, List


# ✅ Request Schema
class CategoryCreate(BaseModel):
    name: str


# ✅ Response Schema
class CategoryResponse(BaseModel):
    id: int
    name: str
    

    class Config:
        orm_mode = True
