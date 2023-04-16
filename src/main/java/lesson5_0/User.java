package lesson5_0;

import java.util.ArrayList;

public class User implements iUser{
    private String password;

    private String login;

    private ArrayList<String> trash;

    public User(String password, String login, ArrayList<String> trash) {
        this.password = password;
        this.login = login;
        this.trash = trash;
    }

    @Override
    public void toPay() {
        System.out.println(">>> Order has been paid!");
    }
}
