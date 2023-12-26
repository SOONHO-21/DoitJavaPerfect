package sec03.EX01;

class A {
    int a = 3;
    void abc() {
        int b = 5;  //지역변수
        class B {   //지역 이너 클래스
            void bcd() {
                System.out.println(a);
                System.out.println(b);
                a = 5;
                //b = 7;  //지역 이너 클래스에서 사용하는 지역변수는 자동 'final' 선언
            }
        }
        B bb = new B();
        bb.bcd();   //정적 이너 메소드에서 정적 이너클래스의 메소드를 실행시키기
    }
}
public class AccessMemberAndLocalVariable {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}