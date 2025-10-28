class ProductInventory:
    def __init__(self, id, name, stock, price, location, tag):
        self.id = id
        self.name = name
        self.stock = stock
        self.price = price
        self.location = location
        self.tag = tag

    def __str__(self):
        return f"ID: {self.id} | Name: {self.name} | Stock: {self.stock} | Price: ₹{self.price} | Location: {self.location} | Tag: {self.tag}"


class Operation:

    def __init__(self):
        self.products = []  # list to store all products

    # Add Operation
    def addProduct(self):
        id = int(input("Enter Product ID: "))
        name = input("Enter Product Name: ")
        stock = int(input("Enter Product Stock: "))
        price = float(input("Enter Product Price: "))
        location = input("Enter Product Location: ")
        tag = input("Enter Product Tag: ")

        prod = ProductInventory(id, name, stock, price, location, tag)
        self.products.append(prod)
        print("\n Product added successfully!")

    # Show Operation
    def display(self):
        if not self.products:
            print("\n No Products Found!")
        else:
            print("\n Product List:")
            for prod in self.products:
                print(prod)

    # Delete Operation
    def deleteProduct(self):
        delete_id = int(input("Enter Product ID to delete: "))
        found = False

        for prod in self.products:
            if prod.id == delete_id:
                self.products.remove(prod)
                found = True
                print(f"\n Product with ID {delete_id} deleted successfully!")
                break

        if not found:
            print(f"\n Product with ID {delete_id} not found.")

    # Update Operation
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

                print("\n Product updated successfully!")
                print(f"Updated Details → {prod}")
                break

        if not found:
            print("\n  Product not found.")

    def sumOfProducts(self):
        if not self.products:
            print("No Product Avialable")

        total_value = 0
        for prod in self.products:
            products_value = prod.price * prod.stock
            total_value += products_value

            print(f"total value of all products in stocks:{total_value}")

    # Low Stock Products List
    def lowStockWarning(self):
        LOW_STOCK = 5
        found = False

        if not self.products:
            print("No product available to check stocks levels")

        for prod in self.products:
            if prod.stock <= LOW_STOCK:
                found = True
                print(f"ID: {prod.id} | Name: {prod.name} | Stock: {prod.stock}")

        if not found:
            print("All products have sufficient stock")

    # Apply discount on products by tag (no predefined methods used)
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
