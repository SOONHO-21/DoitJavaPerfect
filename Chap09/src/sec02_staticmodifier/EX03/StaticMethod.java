package sec02_staticmodifier.EX03;

class A{
    int a=1;    //인스턴트 변수
    static int n=6; //정적 변수
    void abc(){
        System.out.println("인스턴스 메서드");
    }
    static void bcd(){
        //System.out.println(a);    //정적인 메서드 안에서는 정적인 멤버만 사용할 수 있다.
        System.out.println((n+1));
        System.out.println("스태틱 메서드");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        A a1 = new A();
        a1.abc();

        A.bcd();    //정적 메서드 역시 객체 생성 없이 클래스명.메서드 해버리면 됨
        System.out.println(A.n);    //정적 변수 객체 생성 없이 호출

        A a2 = new A();
        a2.bcd();   //이렇게 객체를 생성한 후 사용은 권장하지 않는다.
    }
}