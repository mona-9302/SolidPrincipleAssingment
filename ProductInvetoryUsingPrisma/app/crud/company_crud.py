from prisma import Prisma

db = Prisma()


# ✅ Create Company
async def create_company(data):
    await db.connect()
    company = await db.company.create(
        data={
            "name": data.name,
            "location": data.location,
        }
    )
    await db.disconnect()
    return company


# ✅ Get all Companies
async def get_all_companies():
    await db.connect()
    companies = await db.company.find_many(include={"products": True})
    await db.disconnect()
    return companies


# ✅ Get Company by ID
async def get_company_by_id(company_id: int):
    await db.connect()
    company = await db.company.find_unique(
        where={"id": company_id},
        include={"products": True}
    )
    await db.disconnect()
    return company


# ✅ Update Company
async def update_company(company_id: int, data):
    await db.connect()
    updated = await db.company.update(
        where={"id": company_id},
        data={
            "name": data.name,
            "location": data.location,
        }
    )
    await db.disconnect()
    return updated


# ✅ Delete Company
async def delete_company(company_id: int):
    await db.connect()
    deleted = await db.company.delete(where={"id": company_id})
    await db.disconnect()
    return deleted
