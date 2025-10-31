from fastapi import APIRouter, Depends,HTTPException
from sqlalchemy.orm import Session
from app.crud.company_crud import create_company
from app.database.database import get_db
from app.model.category import Category
from app.schema.category_request import CategoryCreate,CategoryResponse
from app.crud.category_crud import create_categroy,get_all_category,delete_category,update_category

router = APIRouter(prefix="/categrories" , tags=["Categories"])

@router.post("/",response_model=CategoryResponse)
def create_category_api(request: CategoryCreate, db: Session = Depends(get_db)):
    return create_categroy(request, db)

@router.get("/", response_model=list[CategoryResponse])
def get_all_category_api(db: Session = Depends(get_db),skip:int=0,limit:int=5):
    return get_all_category(db,skip,limit)

# ✅ Delete Company
@router.delete("/{category_id}")
def delete_category_api(category_id: int, db: Session = Depends(get_db)):
    return delete_category(category_id, db)

# ✅ Update Company
@router.put("/{category_id}", response_model=CategoryResponse)
def update_category_api(category_id: int, request: CategoryCreate, db: Session = Depends(get_db)):
    return update_category(category_id, request, db)
    