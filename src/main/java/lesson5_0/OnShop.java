package lesson5_0;

public class OnShop implements OnlineShop{

    private String link;

    private String title;

    private int numberOfRegisteredUsers;

    public int status = 0;

    public OnShop(String link, String title, int numberOfRegisteredUsers) {
        this.link = link;
        this.title = title;
        this.numberOfRegisteredUsers = numberOfRegisteredUsers;
    }

    @Override
    public String toString() {
        return "OnlineShop{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", numberOfRegisteredUsers=" + numberOfRegisteredUsers +
                '}';
    }

    @Override
    public void openShop() {
        status = 1;
        System.out.println(">>> Shop is opened!!!");
    }

    @Override
    public void SingIn() {
        if (status == 1) {
            status = 2;
            System.out.println(">>> You are logged in!");
        } else {
            System.out.println(">>> The shop is closed!!!");
        }
    }

    @Override
    public void SingOut() {
        switch (status) {
            case 0:
                System.out.println(">>> The shop is closed!!!");
                break;
            case 1:
                System.out.println(">>> You are not logged in!");
                break;
            case 2:
                status = 1;
                System.out.println(">>> You are logged out!");
                break;
        }
    }
}
