package lesson3_2;

public class Main {
    public static void main(String[] args) {
        Test test = (n) -> {
            int result = 1;
            n = n < 0 ? -n:n;
            for (int i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("НОД является -> " + test.function(12));
        System.out.println("НОД является -> " + test.function(35));
    }
}
