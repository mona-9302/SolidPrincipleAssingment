from sqlalchemy.orm import Session
from sqlalchemy import or_
from app.model.product import Product
from app.model.company import Company
from app.model.category import Category
from fastapi import HTTPException,status
from app.schema.product_request import ProductCreate
from logger.logger import logger 

def create_product(request: ProductCreate, db: Session):
    new_product = Product(
        name=request.name,
        price=request.price,
        company_id=request.company_id,
        category_id=request.category_id
    )
    db.add(new_product)
    db.commit()
    db.refresh(new_product)
    logger.info(f"✅ Product created successfully: {new_product.name}")
    return new_product


# ✅ Get All Companies
def get_all_product(db: Session ,skip:int=0,limit:int=20):
    
     products  =  db.query(Product).offset(skip).limit(limit).all()

     if not products:
         logger.warning("⚠️ No products found in the database.")
         
     else:
         logger.info(f"✅ {len(products)} products fetched from database.")
     return products


# UPDATE
def update_product(product_id: int, request: ProductCreate, db: Session):
    product = db.query(Product).filter(Product.id == product_id).first()
    if not product:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Product not found")

    product.name = request.name
    product.price = request.price
    product.company_id = request.company_id
    product.category_id = request.category_id

    db.commit()
    db.refresh(product)
    return product


# DELETE
def delete_product(product_id: int, db: Session):

    product = db.query(Product).filter(Product.id == product_id).first()
    if not product:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Product not found")
    if product:

      db.delete(product)
      db.commit()
      logger.info(f" Product deleted successfully: ID {product_id}")
      return True
    
    else:

      logger.warning(f"Product with ID {product_id} not found for deletion.")
      return False
    

def search_products(db: Session, q: str = None, company_id: int = None, category_id: int = None):
 
    query = db.query(Product).join(Category).join(Company)

   
    if q:
        query = query.filter(
            or_(
                Product.name.ilike(f"%{q}%"),
                Category.name.ilike(f"%{q}%"),
                Company.name.ilike(f"%{q}%")
            )
        )

    # If company filter is provided
    if company_id:
        query = query.filter(Product.company_id == company_id)

    # If category filter is provided
    if category_id:
        query = query.filter(Product.category_id == category_id)

    # Return all matching products
    return query.all()
  
