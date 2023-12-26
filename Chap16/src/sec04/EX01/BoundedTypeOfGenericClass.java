package sec04.EX01;

class A{}
class B extends A{}
class C extends B{}

//객체를 생성할 때 T에는 B와 C만 올 수 있다
class D<T extends B>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class BoundedTypeOfGenericClass {
    public static void main(String[] args) {
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D();     //D<B> d4 = new D<>()와 같다

        d2.getT();
        d2.setT(new B());
        d2.setT(new C());

        //d3.setT(new B());   //자식이 부모의 객체를 만들 수 없다
        d3.setT(new C());

        d4.setT(new B());   //B, C의 객체가 올 수 있다
        d4.setT(new C());
    }
}