from model.product_inventory import Product 


class FoodProduct(Product):
    def __init__(self, id, name, stock, price, location, tag, expiry_date):
        super().__init__(id, name, stock, price, location, tag)
        self.expiry_date = expiry_date

    def describe(self):
        return f"{super().describe()} | Expiry Date: {self.expiry_date}"

    def __str__(self):
        return self.describe()
