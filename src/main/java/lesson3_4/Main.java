package lesson3_4;

public class Main {
    public static void main(String[] args) {
        InterIs10<Integer, String> name = (x) -> (String.valueOf(x) + "Слово");
        System.out.println(name.sum(10));
    }
}
