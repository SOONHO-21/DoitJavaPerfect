package sec04.EX04;

interface A {
    public abstract void abc();
}

class C{
    void cde(A a) {
        a.abc();
    }
}
public class AnonymousClass_4 {
    public static void main(String[] args) {
        C c = new C();

        //방법 3. 클래스명 X + 참조 변수명 O
        A a = new A() {
            @Override
            public void abc() {
                System.out.println("입력 매개변수 전달");
            }
        };

        //방법 2. 클래스명 O + 참조 변수명 X
        c.cde(new A() {
            @Override
            public void abc() {
                System.out.println("입력 매개변수 전달");
            }
        });
    }
}