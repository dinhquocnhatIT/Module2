package product_manager;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Product> products= new ArrayList<>();

    public ProductManager(){
        products.add(new Product(10000, "Tesla", 10, 100));
        products.add(new Product(10001, "Volvo", 7, 99));
        products.add(new Product(10002, "BMW", 4, 150));
        products.add(new Product(10003, "Mercedes", 6, 110));
        products.add(new Product(10004, "Honda CRV", 2, 30));
        products.add(new Product(10005, "Ferrari Limited :)))", 1, 200));
    }
    public void renderProduct(){
        System.out.printf("\n\t%-16s %-36s %-26s %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
        for (Product product : products)
            System.out.printf("\t%-16s %-36s %-26d $%.2f\n", product.getProductId(), product.getName(), product.getProductQuantity(), product.getProductPrice());
        System.out.println();
    }
    public  void addProduct(){
        renderProduct();
        System.out.println("Input product name: ");
        String name = sc.nextLine();

        System.out.println("Input product quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Input product price: ");
        double price = Double.parseDouble(sc.nextLine());
        products.add(0,new Product(System.currentTimeMillis() % 1000, name, quantity, price));

        renderProduct();
        System.out.println("\n■ Product added successfully!");
    }
    public void editProduct(){
        renderProduct();

        System.out.println("Input product ID to edit: ");
        int productId = Integer.parseInt(sc.nextLine());

        for (Product product : products) {
            if (productId == product.getProductId()) {
                System.out.print("■ Product: " + product + "\n■ Input a new product name: ");
                String newProductName = sc.nextLine();

                System.out.print("■ Input a new product quantity: ");
                int newProductQuantity = Integer.parseInt(sc.nextLine());

                System.out.print("■ Input a new product price: ");
                double newProductPrice = Double.parseDouble(sc.nextLine());

                product.setName(newProductName);
                product.setProductQuantity(newProductQuantity);
                product.setProductPrice(newProductPrice);
            }
        }
        renderProduct();
        System.out.println("\n■ Product edited successfully!");
    }
    public void removeProduct(){
        renderProduct();


        System.out.print("■ Type a product id to remove: ");
        int productId = Integer.parseInt(sc.nextLine());

        products.removeIf(product -> productId == product.getProductId());

        renderProduct();
        System.out.println("\n■ Product removed successfully!");
    }
    public void searchProductByName(){
        renderProduct();
        System.out.println("Input product name to search: ");
        String productName = sc.nextLine();
        int flag = 0;
        for (Product product : products) {
            if (product.getName().contains(productName)) {
                System.out.printf("\t%-16s %-36s %-26d $%.2f\n", product.getProductId(), product.getName(), product.getProductQuantity(), product.getProductPrice());
                flag++;
            }
        }
        if (flag ==0) System.out.println("Product not found! ");
    }
    public void sortByPriceASC() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
              if (o1.getProductPrice() > o2.getProductPrice()){
                  return 1;
              } else if (o1.getProductPrice() < o2.getProductPrice())
                {
                    return -1;
                }else return 0;
            }
        });
        renderProduct();
    }
    public void sortByPriceDESC() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o2.getProductPrice() > o1.getProductPrice()){
                    return 1;
                } else if (o2.getProductPrice() < o1.getProductPrice())
                {
                    return -1;
                }else return 0;
            }
        });
        renderProduct();

    }

//    private void renderProduct(List<Product> newProducts) {
//        System.out.printf("\n\t%-16s %-36s %-26d %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
//        for (Product product : newProducts)
//            System.out.printf("\t%-16s %-36s %-26d $%.2f\n", product.getProductId(), product.getName(), product.getProductQuantity(), product.getProductPrice());
//        System.out.println();
//    }
}

