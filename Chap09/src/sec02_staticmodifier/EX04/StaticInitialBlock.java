package sec02_staticmodifier.EX04;

class A{
    int a;
    static int b;
    static {
        b = 5;
        System.out.println("클래스 A 로딩");
    }
    A(){
       a = 3;
    }
}
public class StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(A.b);    //정적 초기화 블록 호출 및 필드 출력
    }
}