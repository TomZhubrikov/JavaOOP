package lesson1;

public class Cat extends Animal{

    public Cat(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public void say () {
        System.out.println("meo-meo!");
    }
}
