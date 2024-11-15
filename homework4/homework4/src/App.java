public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-_-_-_-_-_-_-_-_");
        BankAccount aliAccount = new BankAccount(10, "ali");
        BankAccount tahaAccont = new BankAccount(-10, "taha");

        System.out.println("ali: " + aliAccount.getBalance());
        System.out.println("taha: " + tahaAccont.getBalance());

        System.out.println("-_-_-_-_-_-_-_-_");

        tahaAccont.deposit(-14);
        tahaAccont.deposit(14);
        aliAccount.deposit(14);

        System.out.println("ali: " + aliAccount.getBalance());
        System.out.println("taha: " + tahaAccont.getBalance());

        System.out.println("-_-_-_-_-_-_-_-_");

        aliAccount.withdraw(-10);
        tahaAccont.withdraw(30);
        aliAccount.withdraw(10);

        System.out.println("ali: " + aliAccount.getBalance());
        System.out.println("taha: " + tahaAccont.getBalance());
    }
}
