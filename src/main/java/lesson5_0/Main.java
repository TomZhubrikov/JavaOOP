package lesson5_0;

public class Main {
    public static void main(String[] args) {
        OnShop samocat = new OnShop("https://samokat.ru/", "foodstuffs", 10000000);
        System.out.println(samocat);

        samocat.SingIn();
        samocat.SingOut();

        samocat.openShop();
        samocat.SingIn();
        samocat.SingOut();
    }
}
