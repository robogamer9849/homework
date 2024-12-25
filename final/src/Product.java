
public class Product {
    String productId;
    String productName;
    protected Double price;
    protected String category;

    public Double getPrice() {
        return price;
    }

    public Product(String productId, String productName, Double price, String category) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
            this.category = category;
    }




    public String Details() {
        return "Product ID: " + productId + 
                "\nProduct Name: " + productName + 
                "\nPrice: $" + price + 
                "\nCategory: " + category;
    }

    public Product compare(Product p1, Product p2) {
        Double expensive =  (double) Double.compare(p1.price, p2.price);
        return -1 == expensive ? p1 : p2;
    }
}
