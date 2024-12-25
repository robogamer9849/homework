import java.util.ArrayList;

public class Customer extends User {
    
    public Customer(String id, String name, String email) {
        super(id, name, email);
    }

    protected ArrayList<Product> cart = new ArrayList<>();

    

    @Override
    public String details() {
        String cartString = "";
        for (Product product : cart) {
            cartString += "\n" + product.Details();
        }

        return "name: " + name + "\n" +
            "id: " + id + "\n" +
            "email: " + email + "\n" + 
            "cart: {" + cartString + "}";
    }


}
