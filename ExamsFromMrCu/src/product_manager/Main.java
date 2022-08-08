package product_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("╔══════════════════════════════════════════════════════════════════════════════════════════════════╗" +
                    "\n║                                                                                                  ║" +
                    "\n║                              PRODUCT MANAGEMENT - v1.0 (Dev Builds)                              ║" +
                    "\n║                                          [Main Menu]                                             ║" +
                    "\n║                                                                                                  ║" +
                    "\n║           ■  [1] Product List - Shows all current product from the Product List.                 ║" +
                    "\n║           ■  [2] Product Add - Adding a new product to the Product List.                         ║" +
                    "\n║           ■  [3] Product Edit - Editing a product from Product List.                             ║" +
                    "\n║           ■  [4] Product Remove - Removing a product from Product List.                          ║" +
                    "\n║           ■  [5] Product Search - Searching a product from Product List.                         ║" +
                    "\n║           ■  [6] Product Sort (Ascending Price) - Sorting product by ascending price.            ║" +
                    "\n║           ■  [7] Product Sort (Descending Price) - Sorting product by descending price.          ║" +
                    "\n║           ■  [8] Exit the application.                                                           ║" +
                    "\n║                                                                                                  ║" +
                    "\n╚══════════════════════════════════════════════════════════════════════════════════════════════════╝" +
                    "\n■ Type a number above by your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    productManager.renderProduct();
                    break;

                case "2":
                    productManager.addProduct();
                    break;

                case "3":
                    productManager.editProduct();
                    break;

                case "4":
                    productManager.removeProduct();
                    break;

                case "5":
                    productManager.searchProductByName();
                    break;

                case "6":
                    productManager.sortByPriceASC();
                    break;

                case "7":
                    productManager.sortByPriceDESC();

                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(0);

                default:
                    System.out.println("■ Invalid selected number, please try again!");
            }
        }
    }
}
