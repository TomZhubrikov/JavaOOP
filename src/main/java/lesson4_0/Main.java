package lesson4_0;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> o= new Gen<Integer, String> (88, "test");
        o.showType();
        System.out.println(o.getObj());
        System.out.println(o.getObj2());
    }
}
