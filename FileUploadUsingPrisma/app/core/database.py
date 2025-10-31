# app/core/database.py
from typing import Generator
from prisma import Prisma

# Prisma client instance (shared)
prisma = Prisma()

async def connect_db() -> None:
    """
    Server start hone par Prisma se connect karne ke liye call karo.
    Use FastAPI startup event to call this.
    """
    try:
        await prisma.connect()
        print("✅ Prisma connected to DB")
    except Exception as e:
        print("❌ Prisma connection failed:", e)
        raise

async def disconnect_db() -> None:
    """
    Server shutdown par Prisma disconnect karne ke liye call karo.
    Use FastAPI shutdown event to call this.
    """
    try:
        await prisma.disconnect()
        print("✅ Prisma disconnected from DB")
    except Exception as e:
        print("❌ Prisma disconnect failed:", e)

def get_prisma() -> Prisma:
    """
    Simple dependency provider for FastAPI routes.
    Use: prisma: Prisma = Depends(get_prisma)
    (Note: Prisma client is async; use prisma.* methods with await in async endpoints)
    """
    return prisma
