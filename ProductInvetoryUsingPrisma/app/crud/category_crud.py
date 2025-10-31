from prisma import Prisma

db = Prisma()


# ✅ Create Category
async def create_category(data):
    await db.connect()
    category = await db.category.create(
        data={
            "name": data.name
        }
    )
    await db.disconnect()
    return category


# ✅ Get all Categories
async def get_all_categories():
    await db.connect()
    categories = await db.category.find_many(include={"products": True})
    await db.disconnect()
    return categories


# ✅ Get Category by ID
async def get_category_by_id(category_id: int):
    await db.connect()
    category = await db.category.find_unique(
        where={"id": category_id},
        include={"products": True}
    )
    await db.disconnect()
    return category


# ✅ Update Category
async def update_category(category_id: int, data):
    await db.connect()
    updated = await db.category.update(
        where={"id": category_id},
        data={"name": data.name}
    )
    await db.disconnect()
    return updated


# ✅ Delete Category
async def delete_category(category_id: int):
    await db.connect()
    deleted = await db.category.delete(where={"id": category_id})
    await db.disconnect()
    return deleted
