package sec05_thismethod.EX01;

class A {
    A() {
        System.out.println("첫 번째 생성자");
    }
    A(int a) {
        this(); //무조건 생성자의 첫번째 줄에 있어야 함
        System.out.println("두 번째 생성자");
    }
}
public class Thismethod_1 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println();
        A a2 = new A(3);
    }
}