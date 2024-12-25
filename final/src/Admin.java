import java.util.ArrayList;

public class Admin extends User{

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    private ArrayList<Product> managing = new ArrayList<>();


    @Override
    public String details() {
        return "name: " + name + "\n" +
            "id: " + id + "\n" +
            "email: " + email + "\n" + 
            "managing :" + managing;
    }

}
