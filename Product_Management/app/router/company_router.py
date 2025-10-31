from fastapi import APIRouter, Depends,HTTPException
from sqlalchemy.orm import Session
from app.database.database import get_db
from app.model.company import Company
from app.schema.comapny_request import CompanyCreate, CompanyResponse
from app.crud.company_crud import create_company,get_company_by_id,update_company,delete_company,get_all_companies

router = APIRouter(prefix="/companies" , tags=["Comapnies"])


@router.post("/", response_model=CompanyResponse)
def create_company_api(request: CompanyCreate, db: Session = Depends(get_db)):
    return create_company(request, db)


@router.get("/", response_model=list[CompanyResponse],)
def get_all_companies_api(db: Session = Depends(get_db),skip:int=0,limit:int=10):
    return get_all_companies(db,skip,limit)


@router.get("/{company_id}", response_model=CompanyResponse)
def get_company_by_id_api(company_id: int, db: Session = Depends(get_db)):
    return get_company_by_id(company_id, db)


@router.put("/{company_id}", response_model=CompanyResponse)
def update_company_api(company_id: int, request: CompanyCreate, db: Session = Depends(get_db)):
    return update_company(company_id, request, db)


@router.delete("/{company_id}")
def delete_company_api(company_id: int, db: Session = Depends(get_db)):
    return delete_company(company_id, db)

