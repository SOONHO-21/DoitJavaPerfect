package sec03.EX02;

class A{
    public <T> void method(T t){
        //System.out.println(t.length()); //String 클래스가 가진 메서드가 아니기 때문에 오류가 난다.
        //즉, 매개변수로 넘겨받은 타입의 객체가 가진 메서드만 호출 가능
        System.out.println(t.equals("안녕")); //Object만 가진 메서드만 ㄱㄴ
    }
}
public class AvailableMethodInGenericMethod {
    public static void main(String[] args) {
        A a = new A();
        a.<String>method("안녕");
    }
}