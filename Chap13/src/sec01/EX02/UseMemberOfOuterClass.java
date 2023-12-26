package sec01.EX02;

class A {
    int a = 3;
    int b = 4;
    void abc(){
        System.out.println("A 클래스 메서드");
    }

    //인스턴스 이너 클래스 정의
    class B {
        int a = 5;
        int b = 6;
        void abc() {
            System.out.println("B 클래스 메서드");
        }
        void bcd(){
            System.out.println(a);
            System.out.println(b);
            abc();

            //아우터 클래스의 멤버 호출 또는 사용
            System.out.println(this.a);
            System.out.println(this.b);
            A.this.abc();
        }
    }
}
public class UseMemberOfOuterClass {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
        b.bcd();
    }
}