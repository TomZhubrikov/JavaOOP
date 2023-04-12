package lesson4_2;

public class A {
    //
}

class B extends A {

}

class C extends B {

}

class D extends C{

}

class Gen2 <T> {
    T obj;

    public Gen2(T obj) {
        this.obj = obj;
    }
    static void test(Gen2<? super B> obj) {

    }
}

class Gen3{
    static void test(Gen2<? super B> obj){
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen2<A> w = new Gen2<>(a);
        Gen2<B> w2 = new Gen2<>(b);
        Gen2<C> w3 = new Gen2<>(c);
        Gen2<D> w4 = new Gen2<>(d);

        test(w);
        test(w2);
//        test(w3);
//        test(w4);

    }
}

