package sec05.EX01;

class A {
    interface B {
        public abstract void bcd();
    }
}

class C implements A.B {
    public void bcd() {
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}
public class CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        A.B b1 = new C();
        b1.bcd();

        A.B b2 = new A.B() {
            @Override
            public void bcd() {
                System.out.println("이너 인터페이스 구현 클래스 생성");
            }
        };
        b2.bcd();
    }
}