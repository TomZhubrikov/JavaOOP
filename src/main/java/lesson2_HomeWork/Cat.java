package lesson2_HomeWork;

public class Cat implements iAnimal{
    public String type, name;
    private int age;
    public double weight;
    public boolean isFly, isWalk, isSwim;

    @Override
    public void Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String display() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalk=" + isWalk +
                ", isSwim=" + isSwim +
                '}';
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }
    public void holiday(Integer numberHolidays) {
        this.weight = weight + numberHolidays * 0.1;
    }
}
