package lesson1;

public class Cat2 extends Cat{

    public Cat2(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    @Override
    public void say () {
        System.out.println("meo-meo-meo-meo!");
    }
}
