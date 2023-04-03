package lesson1;

public class main {
    public static void main(String[] args) {
        // Animal tiger = new Animal("tiger", "Tom", 5, 2.5, false, true, true);
        Cat cat = new Cat("cat", "Tom", 5, 2.5, false, true, true);
        cat.say();
        Cat2 cat2 = new Cat2("cat", "Tom", 5, 2.5, false, true, true);
        cat2.setAge(5);
        System.out.println(cat2.getAge());
    }
}

