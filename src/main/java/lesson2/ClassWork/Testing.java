package lesson2.ClassWork;

public class Testing implements Test{
    int Start;
    int val;

    int prev;

    public Testing() {
        Start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int GetNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        prev = -2;
        Start = 0;
        val = 0;
    }

    @Override
    public void setStar(int x) {
        Start = x;
        val = x;
    }

    int getPrev() {
        return prev;
    }
}
