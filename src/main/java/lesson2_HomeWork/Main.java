package lesson2_HomeWork;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Animal("cat", "Tom", 5, 2.5, false, true, true);
        System.out.println(cat.getAge());
        cat.setAge(8);
        System.out.println(cat.getAge());
        cat.display();
        cat.rename("Bill");
        System.out.println(cat.getName());
    }
}
