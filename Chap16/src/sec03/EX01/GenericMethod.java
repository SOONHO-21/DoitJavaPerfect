package sec03.EX01;

//일반 클래스안에 제네릭 메서드
class GenericMethods {
    public <T> T method1(T t) {
        return t;
    }
    public <T> boolean method2(T t1, T t2) {    //두개의 입력 매개변수의 타입은 똑같다
        return t1.equals(t2);
    }
    public <K ,V> void method3(K k, V v){
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method1("안녕");
        String str2 = gm.method1("Hi");

        boolean b1 = gm.<Double>method2(5.1, 1.8);
        boolean b2 = gm.method2(2.1, 2.1); //<> 생략 가능
        System.out.println(b1);
        System.out.println(b2);

        gm.<String, Integer>method3("국어", 80);
        gm.method3("수학", 80);   ///<> 생략 가능. 추청할 수 있다면!

        
    }
}