class Product:
    
    def __init__(self, id, name, stock, price, location, tag):
        self.id = id
        self.name = name
        self.stock = stock
        self.price = price
        self.location = location
        self.tag = tag

    def value(self):
        return self.stock * self.price

    def describe(self):
        return f"ID: {self.id} | Name: {self.name} | Price: ₹{self.price} | Stock: {self.stock} | Location: {self.location} | Tag: {self.tag}"

    def __str__(self):
        # This method runs automatically when print() is used
        return self.describe()


class FoodProduct(Product):
    def __init__(self, id, name, stock, price, location, tag, expiry_date):
       
        super().__init__(id, name, stock, price, location, tag)
        self.expiry_date = expiry_date

    def describe(self):
        # Polymorphism example: override describe()
        return f"{super().describe()} | Expiry Date: {self.expiry_date}"

    def __str__(self):
        # Override str() for printing
        return self.describe()
