package lesson2_HomeWork;

public interface iAnimal {
    String type = "dog", name = "Bob";
    int age = 0;
    double weight = 0;
    boolean isFly = false, isWalk = false, isSwim = false;

    void Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim);

    int getAge();

    void setAge(int age);

    String display();
    void rename(String newName);
}
