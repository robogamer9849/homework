public class BankAccount {
    private double balance;
    private String owner;


    public BankAccount(double balance, String owner) {
        this.owner = owner;
        try{
            if(balance < 0){
                this.balance = 0;
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            this.balance = balance;
        }
        catch (Exception e) {
            System.out.println(owner + ": " + e.getMessage());
        }
    }

    public void deposit(double amount) {
        try{
            if(amount <= 0){
                throw new IllegalArgumentException("Amount must be greater than zero");
            }
            balance += amount;
        }
        catch (Exception e) {
            System.out.println(owner + ": " + e.getMessage());
        }
    }

    public void withdraw(double amount) {
        try{
            if(amount <= 0){
                throw new IllegalArgumentException("Amount must be greater than zero");
            }
            if(balance < amount){
                throw new InsufficientFundsExpetion("Insufficient funds for withdrow");
            }
            balance -= amount;
        }
        catch (Exception e) {
            System.out.println(owner + ": " + e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }
}