from pydantic import BaseModel

class ProductCreate(BaseModel):
    
    name:str
    price:int
    company_id:int
    category_id:int

class ProductResponse(BaseModel):

     id:int
     name:str
     price:int
     company_id:int
     category_id:int

     class Config:
          from_attributes=True