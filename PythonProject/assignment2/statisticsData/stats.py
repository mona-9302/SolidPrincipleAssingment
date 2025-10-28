import numpy as np

class Statistic:
    def __init__(self):
        self.products = []

    # ... (all your existing methods remain same)

   
    def show_stats(self):
        if not self.products:
            print("\nNo products available to calculate statistics.\n")
            return

        prices = np.array([p.price for p in self.products])
        stocks = np.array([p.stock for p in self.products])
        values = prices * stocks 

        print("\n📊 INVENTORY STATISTICS REPORT 📊\n")

        
        avg_price = np.mean(prices)
        print(f"Average Price of Items: ₹{avg_price:.2f}")

        # b. Most expensive item price
        max_price = np.max(prices)
        print(f"Most Expensive Item Price: ₹{max_price:.2f}")

        # c. Total count of all items in stock
        total_stock = np.sum(stocks)
        print(f"Total Count of All Items in Stock: {total_stock}")

        # d. Total inventory value per product
        print("\nTotal Inventory Value (per product):")
        for p, val in zip(self.products, values):
            print(f"  {p.name} → ₹{val:.2f}")

        # e. Compute average price and total value for products with a specific tag
        tag = input("\nEnter tag to filter (e.g., 'clearance'): ").strip().lower()
        tagged_products = [p for p in self.products if p.tag.lower() == tag]

        if tagged_products:
            tagged_prices = np.array([p.price for p in tagged_products])
            tagged_values = np.array([p.price * p.stock for p in tagged_products])
            print(f"\n--- Stats for tag '{tag}' ---")
            print(f"Average Price: ₹{np.mean(tagged_prices):.2f}")
            print(f"Total Value: ₹{np.sum(tagged_values):.2f}")
        else:
            print(f"\nNo products found with tag '{tag}'.")
