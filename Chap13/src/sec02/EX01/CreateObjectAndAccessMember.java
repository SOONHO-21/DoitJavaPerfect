package sec02.EX01;

class A {
    int a = 3;
    static int b = 4;
    void method1() {
        System.out.println("instance method");
    }
    static void method2() {
        System.out.println("static method");
    }

    static class B {
        void bcd() {
            //필드 사용
            //System.out.println(a);  //정적 이너 클래스는 아우터 클래스의 '정적 멤버'만 사용 가능하다.
            System.out.println(b);
            //메서드 호출
            //method1();    //정적 이너 클래스는 아우터 클래스의 '정적 멤버'만 사용 가능하다.
            method2();
        }
    }
}
public class CreateObjectAndAccessMember {
    public static void main(String[] args) {
        A.B b = new A.B();  //정적 이너클래스의 객체 생성

        //메서드 호출
        b.bcd();
    }
}