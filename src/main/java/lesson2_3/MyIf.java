package lesson2_3;

public interface MyIf {
    int getUserID();
    default int getAdminID() {
        return 1;
    }
}
