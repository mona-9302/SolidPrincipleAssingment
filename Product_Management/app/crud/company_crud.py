from sqlalchemy.orm import Session
from fastapi import HTTPException
from app.model.company import Company
from app.schema.comapny_request import CompanyCreate

def create_company(request: CompanyCreate, db: Session):
    new_company = Company(name=request.name, location=request.location)
    db.add(new_company)
    db.commit()
    db.refresh(new_company)
    return new_company

def get_company_by_id(company_id: int, db: Session):
    company = db.query(Company).filter(Company.id == company_id).first()
    if not company:
        raise HTTPException(status_code=404, detail="Company not found")
    return company

# ✅ Update Company
def update_company(company_id: int, request: CompanyCreate, db: Session):
    company = db.query(Company).filter(Company.id == company_id).first()
    if not company:
        raise HTTPException(status_code=404, detail="Company not found")

    company.name = request.name
    company.location = request.location

    db.commit()
    db.refresh(company)
    return company

# ✅ Delete Company
def delete_company(company_id: int, db: Session):
    company = db.query(Company).filter(Company.id == company_id).first()
    if not company:
        raise HTTPException(status_code=404, detail="Company not found")

    db.delete(company)
    db.commit()
    return {"message": "Company deleted successfully"}

# ✅ Get All Companies
def get_all_companies(db: Session ,skip:int=0,limit:int=20):
    
    return db.query(Company).offset(skip).limit(limit).all()