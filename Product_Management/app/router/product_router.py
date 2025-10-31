from fastapi import APIRouter, Depends, HTTPException, Query
from sqlalchemy.orm import Session
from app.database.database import get_db
from app.crud.product_crud import create_product,get_all_product,update_product,delete_product,search_products
from app.schema.product_request import ProductCreate, ProductResponse
from logger.logger import logger

router = APIRouter(prefix="/products", tags=["Products"])

@router.post("/", response_model=ProductResponse)
def create_product_api(request: ProductCreate, db: Session = Depends(get_db)):
    return create_product(request, db)


@router.get("/", response_model=list[ProductResponse])
def get_all_product_api(db: Session = Depends(get_db),skip:int=0,limit:int=20):
    return get_all_product(db,skip,limit)


# UPDATE
@router.put("/{product_id}", response_model=ProductResponse)
def update_product_api(product_id: int, request: ProductCreate, db: Session = Depends(get_db)):
    return update_product(product_id, request, db)


# DELETE
@router.delete("/{product_id}")
def delete_product_api(product_id: int, db: Session = Depends(get_db)):
    return delete_product(product_id, db)


@router.get("/search", response_model=list[ProductResponse])
def search_product_api(
    q: str = Query(None, description="Search keyword (name/category/company)"),
    company_id: int = Query(None, description="Filter by company id"),
    category_id: int = Query(None, description="Filter by category id"),
    db: Session = Depends(get_db)
):
    logger.info(f"Searching products for q='{q}', company_id={company_id}, category_id={category_id}")

    products = search_products(db, q, company_id, category_id)

    if not products:
        logger.warning("No products found for given filters")

    return products
