package sec03.EX03;

//1. 하위 메스드에 직접 예외를 처리할 때
class A {
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Class cls = Class.forName("java.lang.Object");  //ClassNotFoundException
            Thread.sleep(1000); //InterruptedException
        } catch (InterruptedException | ClassNotFoundException e) {
            //예외 처리 구문
        }
    }
}

//2. 예외를 호출 메서드로 전가할 때
class B {
    void abc() {
        try {
            bcd();  //InterruptedException
        } catch (InterruptedException | ClassNotFoundException e) {
            //예외 처리 구문
            //bcd메소드에서 저 두개의 예외를 처리할 의무를 abc메소드에 넘긴 것
        }
    }
    void bcd() throws InterruptedException, ClassNotFoundException {    //예외 전가
        Class cls = Class.forName("java.lang.Object");  // ClassNotFoundException
        Thread.sleep(1000); // InterruptedException
    }
}
public class ThrowsException_3 {
    public static void main(String[] args) {

    }
}