from pydantic import BaseModel

class CompanyCreate(BaseModel):

    name:str
    location:str

class CompanyResponse(BaseModel):

    id:int
    name:str
    location:str

    class Config:

        from_attributes=True