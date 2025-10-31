from pydantic import BaseModel
from typing import Optional, List




# ✅ Request Schema (for Create/Update)
class CompanyCreate(BaseModel):
    name: str
    location: str


# ✅ Response Schema (for Reading)
class CompanyResponse(BaseModel):
    id: int
    name: str
    location: str
    

    class Config:
        orm_mode = True
