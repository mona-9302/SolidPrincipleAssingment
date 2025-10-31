from prisma import Prisma

db = Prisma()


# ✅ Create a new Product
async def create_product(data):
    await db.connect()
    product = await db.product.create(
        data={
            "name": data.name,
            "price": data.price,
            "company_id": data.company_id,
            "category_id": data.category_id,
        }
    )
    await db.disconnect()
    return product


# ✅ Get all Products
async def get_all_products():
    await db.connect()
    products = await db.product.find_many(
        include={
            "company": True,
            "category": True
        }
    )
    await db.disconnect()
    return products


# ✅ Get Product by ID
async def get_product_by_id(product_id: int):
    await db.connect()
    product = await db.product.find_unique(
        where={"id": product_id},
        include={"company": True, "category": True}
    )
    await db.disconnect()
    return product


# ✅ Update Product
async def update_product(product_id: int, data):
    await db.connect()
    updated = await db.product.update(
        where={"id": product_id},
        data={
            "name": data.name,
            "price": data.price,
            "company_id": data.company_id,
            "category_id": data.category_id,
        }
    )
    await db.disconnect()
    return updated


# ✅ Delete Product
async def delete_product(product_id: int):
    await db.connect()
    deleted = await db.product.delete(where={"id": product_id})
    await db.disconnect()
    return deleted
