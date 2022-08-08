package product_manager;

public class Product {
    private String name;
    private long productId;
    private int productQuantity;
    private double productPrice;

    public Product(long productId, String name, int quantity, double price) {
        this.name = name;
        this.productId = productId;
        this.productQuantity = quantity;
        this.productPrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product: \n" +
                "   Product Id:  " + productId + '\n' +
                "   Name:  " + name + '\n' +
                "   Product Quantity:  " + productQuantity + '\n' +
                "   Product Price:  " + productPrice;
    }
}


