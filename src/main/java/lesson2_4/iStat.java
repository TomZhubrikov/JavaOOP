package lesson2_4;

public interface iStat {
    int getUserID();
    default int getAdminID() {
        return 1;
    }
    static int getUniversalID() {
        return 5;
    }
}
