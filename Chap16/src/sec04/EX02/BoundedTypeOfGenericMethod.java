package sec04.EX02;

class A {
    //최상위 클래스가 Number클래스이므로 intValue메소드 호출 가능
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface MyInterface {
    public abstract void print();
}
class B{
    public <T extends MyInterface> void method1(T t) {
        t.print();
    }
}
public class BoundedTypeOfGenericMethod {
    public static void main(String[] args) {
        A a = new A();
        a.method1(1.5);     //1

        B b = new B();
        b.method1(new MyInterface() {
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
    }
}