import java.util.Comparator;
import java.util.List;

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

    public static String compare(Product p1, Product p2) {
        Double cheap =  (double) Double.compare(p1.price, p2.price);
        return -1 == cheap ? p1.Details() : p2.Details();
    }

    public static List<Product> allFromCategory(List<Product> products, String category) {
        return products.stream().filter(product -> product.category.equals(category)).toList();
    }

    
    public static Product mostExpensive(List<Product> p){
        return p.stream().max((p1, p2) -> Double.compare(p1.price, p2.price)).get();
    }

    public static long above(Double price, List<Product> p){
        return p.stream().filter(product -> product.price > price).count();
    }

    public static List<String> categories(List<Product> p){
        return p.stream().map(product -> product.category).distinct().toList();
    }

    public static List<Product> sort(List<Product> p){
        return p.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).toList();
    }
}
