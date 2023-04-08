package lesson2.ClassWork;

public class Main {
    public static void main(String[] args) {
        Testing num = new Testing();
        NumTest n = new NumTest();
        Test obj;
        for (int i = 0; i < 5; i++) {
            obj = num;
            System.out.println("Next number -> " + obj.GetNext());
            obj = n;
            System.out.println("Next number -> " + obj.GetNext());
        }
    }
}
