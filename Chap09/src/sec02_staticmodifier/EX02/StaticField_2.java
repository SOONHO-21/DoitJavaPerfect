package sec02_staticmodifier.EX02;

class A{
    int m = 3;
    static int n = 5;
}
public class StaticField_2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        //인스턴스 필드
        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m);
        System.out.println(a2.m);

        //정적 필드
        a1.n = 7;
        a1.n = 8;
        System.out.println(a1.n);
        System.out.println(a2.n);

        A.n = 9;    //객체 생성할 필요 없음. 바로 클래스이름.변수명 써버리면 됨
        System.out.println(A.n);
        System.out.println(A.n);    //둘다 9 출력. 정적 필드는 메모리 값을 공유 함
    }
}