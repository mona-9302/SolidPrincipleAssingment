from sqlalchemy import Column, Integer, String, ForeignKey
from sqlalchemy.orm import relationship
from app.database.database import Base

class Product(Base):
    
    __tablename__ = "products"

    id = Column(Integer, primary_key=True, index=True)
    name = Column(String(100), nullable=False)
    price = Column(Integer, nullable=False)

    # ✅ Correct ForeignKey table names (use plural tablenames)
    company_id = Column(Integer, ForeignKey("companies.id"))
    category_id = Column(Integer, ForeignKey("categories.id"))

    # Many products → One company/category
    company = relationship("Company", back_populates="products")
    category = relationship("Category", back_populates="products")
