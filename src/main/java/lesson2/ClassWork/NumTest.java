package lesson2.ClassWork;

public class NumTest implements Test{
    int Start;
    int val;

    int prev;

    public NumTest() {
        Start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int GetNext() {
        prev = val;
        val += 10;
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
