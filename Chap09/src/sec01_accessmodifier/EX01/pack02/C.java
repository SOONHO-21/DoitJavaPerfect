package sec01_accessmodifier.EX01.pack02;
import sec01_accessmodifier.EX01.pack01.A;

public class C {
    public void print(){
        A a = new A();

        System.out.println(a.a + " ");  //다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는
                                        // public 접근 지정자만 사용 가능
//        System.out.println(a.b + " ");
//        System.out.println(a.c + " ");
//        System.out.println(a.d + " ");
    }
}
