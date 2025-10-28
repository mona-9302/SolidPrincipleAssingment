# service/operation_service.py

from model.product_inventory import Product
from model.food_product import FoodProduct


class Operation:

    def __init__(self):
        self.products = []

    # Add Product
    def addProduct(self):
        print("\nChoose Product Type:")
        print("1. Normal Product")
        print("2. Food Product (with Expiry Date)")

        choice = input("Enter choice (1 or 2): ")

        id = int(input("Enter Product ID: "))
        name = input("Enter Product Name: ")
        stock = int(input("Enter Product Stock: "))
        price = float(input("Enter Product Price: "))
        location = input("Enter Product Location: ")
        tag = input("Enter Product Tag: ")

        
        if choice == "2":
            expiry_date = input("Enter Expiry Date (dd-mm-yyyy): ")
           
            prod = FoodProduct(id, name, stock, price, location, tag, expiry_date)
        else:
            
            prod = Product(id, name, stock, price, location, tag)

        # Add product to list
        self.products.append(prod)
        print("\n✅ Product added successfully!\n")

    # Display Products
    def display(self):
        if not self.products:
            print("\nNo Products Found!")
        else:
            print("\nProduct List:")
            for prod in self.products:
                print(prod)

    # Delete Product
    def deleteProduct(self):
        delete_id = int(input("Enter Product ID to delete: "))
        found = False

        for prod in self.products:
            if prod.id == delete_id:
                self.products.remove(prod)
                found = True
                print(f"\nProduct with ID {delete_id} deleted successfully!")
                break

        if not found:
            print(f"\nProduct with ID {delete_id} not found.")

    # Update Product
    def updateProduct(self):
        update_id = int(input("Enter Product ID to update: "))
        found = False

        for prod in self.products:
            if prod.id == update_id:
                found = True
                print(f"\nCurrent Details → {prod}")

                new_name = input("Enter New Name (press Enter to skip): ")
                new_stock = input("Enter New Stock (press Enter to skip): ")
                new_price = input("Enter New Price (press Enter to skip): ")
                new_location = input("Enter New Location (press Enter to skip): ")
                new_tag = input("Enter New Tag (press Enter to skip): ")

                if new_name:
                    prod.name = new_name
                if new_stock:
                    prod.stock = int(new_stock)
                if new_price:
                    prod.price = float(new_price)
                if new_location:
                    prod.location = new_location
                if new_tag:
                    prod.tag = new_tag

                print("\nProduct updated successfully!")
                print(f"Updated Details → {prod}")
                break

        if not found:
            print("\nProduct not found.")

    # Calculate Total Stock Value
    def sumOfProducts(self):
        if not self.products:
            print("No Product Available")
            return

        total_value = 0
        for prod in self.products:
            total_value += prod.price * prod.stock

        print(f"Total value of all products in stock: ₹{total_value}")

    # Low Stock Warning
    def lowStockWarning(self):
        LOW_STOCK = 5
        found = False

        if not self.products:
            print("No product available to check stock levels")
            return

        for prod in self.products:
            if prod.stock <= LOW_STOCK:
                found = True
                print(f"ID: {prod.id} | Name: {prod.name} | Stock: {prod.stock}")

        if not found:
            print("All products have sufficient stock")

    # Apply Discount
    def applyDiscount(self, tag, discount=0.5):
        if not self.products:
            print("No products available!")
            return

        found = False

        for p in self.products:
            if p.tag == tag:
                found = True
                old_price = p.price
                new_price = old_price * (1 - discount)
                p.price = new_price
                print("Product Name:", p.name)
                print("Old Price: ₹", old_price)
                print("New Price: ₹", new_price)
                print("-----------------------------")

        if not found:
            print("No product found with tag:", tag)
        else:
            print("Discount applied successfully!")
