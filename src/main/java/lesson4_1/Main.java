package lesson4_1;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> obj = new Numeric<>(5);
        System.out.println("Revert value " + obj.getNum());
        System.out.println("Double part " + obj.getNum2());

        Numeric<Double> obj2 = new Numeric<>(5.6);
        System.out.println("Revert value " + obj2.getNum());
        System.out.println("Double part " + obj2.getNum2());


    }
}
