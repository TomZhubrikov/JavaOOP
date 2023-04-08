package lesson3_3;

public class Program {
    public static void main(String[] args) {
        MyInterface<Integer> tests = (n, m) -> (n % m == 0);
        if (tests.test(10, 10)) {
            System.out.println("Good!");
        }

        MyInterface<Double> doub = (n, m) -> (n % m == 0);
        if (doub.test(10.5, 10.5)) {
            System.out.println("Good!");
        }

        MyInterface<Double> str = (n, m) -> (n % m == 0);
        if (doub.test(10.5, 10.5)) {
            System.out.println("Good!");
        }
    }
}
