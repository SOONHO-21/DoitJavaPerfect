package sec02.EX01;

class MyClass<T> {
    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
public class SingleGenericArgument {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<>();
        mc1.setT("안녕");
        System.out.println(mc1.getT());

        MyClass<Integer> mc2 = new MyClass<>();
        mc2.setT(1);
        System.out.println(mc2.getT());

        //MyClass<Integer> mc3 = new MyClass<>();
        //mc3.setT("Hi"); //강한 타입 체크로 문법 오류 발생
    }
}
