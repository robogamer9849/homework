public abstract class User {
    protected String id;
    protected String name;
    protected String email;

    public abstract String details();

    public User(String id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
    
}
