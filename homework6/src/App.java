import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        Predicate<Double> isEligible = x -> x > 100;
        Function<Double, Double> applyDiscount = x -> (x * 0.9);
        Consumer<Double> printPrice = x -> System.out.println(x * 1.05);

        Scanner input = new Scanner(System.in);
        System.out.println("what is the price? ");
        Double price = input.nextDouble();
        System.out.println();
        if (isEligible.test(price)) {
            System.out.println("discount applied\n");
            applyDiscount.apply(price);
        }
        System.out.println("final price: ");
        printPrice.accept(price);
        input.close();
    }
}
