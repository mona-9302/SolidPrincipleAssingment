from fastapi import APIRouter, HTTPException
from app.schema.category_schema import CategoryCreate, CategoryResponse
from app.crud import category_crud

router = APIRouter(prefix="/categories", tags=["Categories"])


# ✅ Create Category
@router.post("/", response_model=CategoryResponse)
async def create_category(data: CategoryCreate):
    category = await category_crud.create_category(data)
    return category


# ✅ Get All Categories
@router.get("/", response_model=list[CategoryResponse])
async def get_categories():
    categories = await category_crud.get_all_categories()
    return categories


# ✅ Get Category by ID
@router.get("/{category_id}", response_model=CategoryResponse)
async def get_category(category_id: int):
    category = await category_crud.get_category_by_id(category_id)
    if not category:
        raise HTTPException(status_code=404, detail="Category not found")
    return category


# ✅ Update Category
@router.put("/{category_id}", response_model=CategoryResponse)
async def update_category(category_id: int, data: CategoryCreate):
    updated = await category_crud.update_category(category_id, data)
    if not updated:
        raise HTTPException(status_code=404, detail="Category not found")
    return updated


# ✅ Delete Category
@router.delete("/{category_id}")
async def delete_category(category_id: int):
    deleted = await category_crud.delete_category(category_id)
    if not deleted:
        raise HTTPException(status_code=404, detail="Category not found")
    return {"message": "Category deleted successfully"}
