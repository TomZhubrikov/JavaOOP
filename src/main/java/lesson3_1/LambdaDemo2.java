package lesson3_1;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.printf("%d is a divisor %d", 2, 10);
        }
        if (!isFactor.test(10, 3)) {
            System.out.printf("%d is not a divisor %d", 3, 10);
        }

        NumericTest lessThen = (n, m) -> (n < m);
        if (lessThen.test(10, 2)) {
            System.out.printf("%d over then %d", 10, 2);
        }
        if (!isFactor.test(10, 2)) {
            System.out.printf("%d less then %d", 10, 2);
        }

        NumericTest absqual = (n, m) -> (n < 0 ? -n:n) == (m < 0 ? -m:m);
        if (absqual.test(4, -4)) {
            System.out.printf("Good!");
        }
        if (!absqual.test(10, 2)) {
            System.out.printf("Bad!");
        }
    }
}
