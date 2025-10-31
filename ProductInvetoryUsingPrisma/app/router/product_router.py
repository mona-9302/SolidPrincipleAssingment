from fastapi import APIRouter, HTTPException
from app.schema.product_schema import ProductCreate, ProductResponse
from app.crud import product_crud

router = APIRouter(prefix="/products", tags=["Products"])


# ✅ Create Product
@router.post("/", response_model=ProductResponse)
async def create_product(data: ProductCreate):
    product = await product_crud.create_product(data)
    return product


# ✅ Get All Products
@router.get("/", response_model=list[ProductResponse])
async def get_products():
    products = await product_crud.get_all_products()
    return products


# ✅ Get Product by ID
@router.get("/{product_id}", response_model=ProductResponse)
async def get_product(product_id: int):
    product = await product_crud.get_product_by_id(product_id)
    if not product:
        raise HTTPException(status_code=404, detail="Product not found")
    return product


# ✅ Update Product
@router.put("/{product_id}", response_model=ProductResponse)
async def update_product(product_id: int, data: ProductCreate):
    updated = await product_crud.update_product(product_id, data)
    if not updated:
        raise HTTPException(status_code=404, detail="Product not found")
    return updated


# ✅ Delete Product
@router.delete("/{product_id}")
async def delete_product(product_id: int):
    deleted = await product_crud.delete_product(product_id)
    if not deleted:
        raise HTTPException(status_code=404, detail="Product not found")
    return {"message": "Product deleted successfully"}
