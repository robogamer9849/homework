import java.util.ArrayList;

public class Orderer {
    private int orderId;
    private ArrayList<Product> productList;

    public Orderer(int orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.productList = productList;
    }


    public void addToOrder(Customer customer, Product product) throws Exception {
        if (productList.contains(product)){
            customer.cart.add(product);
        }
        else {
            throw new Exception("ProductNotFoundException");
        }
    }

    public Double calcTotalAmount(Customer customer) {
        double sum = 0.0;
        for (Product product : customer.cart) {
            sum += product.price;
        }
        return sum;
    }

    public String Details(Customer customer) {
        

        return "Order ID: " + orderId + 
            "\nCustomer:{ " + customer.details() + 
            "}\nProducts: " + productList.toString() + 
            "\nTotal Amount: $" + String.format("%.2f", calcTotalAmount(customer));
    }
}
