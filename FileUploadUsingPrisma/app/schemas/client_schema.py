# app/schemas/client_schema.py
from pydantic import BaseModel, EmailStr
from typing import Optional
from datetime import datetime

# ✅ Client create/update input model
class ClientCreate(BaseModel):
    name: str
    email: EmailStr
    about: Optional[str] = None

# ✅ Client response model
class ClientResponse(BaseModel):
    id: int
    name: str
    email: EmailStr
    about: Optional[str] = None
    createdAt: datetime

    class Config:
        orm_mode = True
