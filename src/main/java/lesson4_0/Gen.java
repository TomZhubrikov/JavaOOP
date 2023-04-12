package lesson4_0;

public class Gen<T, V> {
    T obj;
    V obj2;

    public Gen(T obj, V obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    void showType() {
        System.out.println("Type T is" + obj.getClass().getName());
        System.out.println("Type T is" + obj2.getClass().getName());
    }

    T getObj() {
        return obj;
    }
    V getObj2() {
        return obj2;
    }
}

