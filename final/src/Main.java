import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C001", "John Doe", "john@example.com");
        Customer customer2 = new Customer("C002", "Dave Smith", "dave@example.com");
        
        Admin admin1 = new Admin("A001", "Jane Smith", "jane@admin.com");
        Admin admin2 = new Admin("A001", "Josh allen", "josh@admin.com");
        
        Product product1 = new Product("P001", "Laptop", 999.99, "electronics");
        Product product2 = new Product("P002", "cup", 99.99, "glass");
        Product product3 = new Product("P003", "Tablet", 599.99, "electronics");
        Product product4 = new Product("P004", "watch", 699.99, "electronics");
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Orderer orderer = new Orderer(001, productList);

        try{
            orderer.addToOrder(customer2, product2);
            orderer.addToOrder(customer2, product1);
            orderer.addToOrder(customer1, product2);
            orderer.addToOrder(customer1, product4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println(orderer.Details(customer1));
        System.out.println("---");
        System.out.println(orderer.Details(customer2));
        System.out.println();
        System.out.println(customer1.details());
        System.out.println("---");
        System.out.println(customer2.details());
        System.out.println();
        System.out.println(admin1.details());
        System.out.println("---");
        System.out.println(admin2.details());
        System.out.println("---`");
        System.out.println(product1.Details());
        System.out.println("---");
        System.out.println(product2.Details());
        System.out.println("---");
        System.out.println(product3.Details());



        System.out.println();
        System.out.println();
        System.out.println("cheap one:" + product1.compare(product3, product2).Details());
        System.out.println("---");
        System.out.println();
        System.out.println();
        System.out.println();

        List<Product> electrics = productList.stream().filter(product -> product.category.equals("electronics")).toList();

        for (Product product : electrics) {
            System.out.println(product.Details() + "\n---");
        }


        Product expensive = productList.stream().max((p1, p2) -> Double.compare(p1.price, p2.price)).get();
        System.out.println(expensive.Details());


        long above500 = productList.stream().filter(product -> product.price > 500).count();
        System.out.println(above500);

        List<String> categories = productList.stream().map(product -> product.category).distinct().toList();
        System.out.println(categories);


        System.out.println();

        List<Product> sorted = productList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).toList();
        for (Product product : sorted) {
            System.out.println(product.Details() + "\n---");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        Function<List<Product>, List<Product>> isCheap = products -> {
            for (Product product : products) {
                if(product.price < 100)
                products.remove(product);
            }
            return products;
        };
        isCheap.apply(productList).forEach(product -> System.out.println(product.Details() + "\n---"));
        
        System.out.println("---");


        BiFunction<Product, Integer, Product> discount = (product, amount) -> new Product(product.productId, product.productName, product.price*(100-amount)/100, product.category);
        System.out.println(discount.apply(product1, 10).Details());

        Consumer<Product> printProduct = product -> System.out.println(product.Details());
        System.out.println("---");
        printProduct.accept(product1);
    }
}
