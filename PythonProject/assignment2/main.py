from model.product_inventory import Product
from service.product_operation import Operation
from statisticsData.stats import Statistic


def main():
    op = Operation()
    st = Statistic()

    while True:
        print("\n==== PRODUCT INVENTORY MENU ====")
        print("1. Add Product")
        print("2. Display Products")
        print("3. Delete Product")
        print("4. Update Product")
        print("5. Total Stock Value")
        print("6. Low Stock Warning")
        print("7. Apply Discount")
        print("8. Show Statistics Report")
        print("9. Exit")

        choice = input("Enter your choice: ")

        if choice == '1':
            op.addProduct()

        elif choice == '2':
            op.display()

        elif choice == '3':
            op.deleteProduct()

        elif choice == '4':
            op.updateProduct()

        elif choice == '5':
            op.sumOfProducts()

        elif choice == '6':
            op.lowStockWarning()

        elif choice == '7':
            tag = input("Enter tag to apply discount: ")
            op.applyDiscount(tag)

        elif choice == '8':
            st.products = op.products
            st.show_stats()

        elif choice == '9':
            print("Exiting... Thank you!")
            break

        else:
            print("Invalid choice! Please try again.")


main()
