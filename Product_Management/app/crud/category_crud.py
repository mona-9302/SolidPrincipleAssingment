from sqlalchemy.orm import Session
from fastapi import HTTPException
from app.model.category import Category
from app.schema.category_request import CategoryCreate


def create_categroy(request:CategoryCreate , db:Session):
    new_category = Category(name=request.name)
    db.add(new_category)
    db.commit()
    db.refresh(new_category)
    return new_category

#  ✅ Get All Category
def get_all_category(db: Session,skip:int=0,limit:int=5):
    return db.query(Category).all()


# ✅ Delete Company
def delete_category(category_id: int, db: Session):
    category = db.query(Category).filter(Category.id == category_id).first()
    if not category:
        raise HTTPException(status_code=404, detail="Category not found")

    db.delete(category)
    db.commit()
    return {"message": "Category deleted successfully"}

def update_category(category_id: int, request: CategoryCreate, db: Session):
    category = db.query(Category).filter(Category.id == category_id).first()
    if not category:
        raise HTTPException(status_code=404, detail="Company not found")

    category.name = request.name
    

    db.commit()
    db.refresh(category)
    return category