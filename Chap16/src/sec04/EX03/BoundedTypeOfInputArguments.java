package sec04.EX03;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
class Test {
    void method1(Goods<A> g){};     //명시적으로 A객체만 가능
    void method2(Goods<?> g){};
    void method3(Goods<? extends B> g){};
    void method4(Goods<? super B> g){};
}
public class BoundedTypeOfInputArguments {
    public static void main(String[] args) {
        Test t = new Test();
        t.method1(new Goods<A>());

        t.method2(new Goods<A>());
        t.method2(new Goods<B>());
        t.method2(new Goods<C>());
        t.method2(new Goods<D>());

        //t.method3(new Goods<A>());  //B를 상속받는 하위 객체만 가능
        t.method3(new Goods<B>());
        t.method3(new Goods<C>());
        t.method3(new Goods<D>());

        t.method4(new Goods<A>());
        t.method4(new Goods<B>());
//        t.method4(new Goods<C>());    //B와 B의 상위 객체만 가능
//        t.method4(new Goods<D>());
    }
}