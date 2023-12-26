package sec02.EX03;

class Apple {}
class Pencil {}
class Goods<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
public class Solution2_Generic {
    public static void main(String[] args) {
        //1.Goods를 활용해 Apple 객체를 추가하거나 가져오기
        Goods<Apple> goods1 = new Goods<>();
        goods1.setT(new Apple());   //입력 매개변수에서 객체 생성
        Apple apple = goods1.getT();

        //2. Goods를 이용해 Pencil 객체를 추가하거나 가져오기
        Goods<Pencil> goods2 = new Goods<>();
        goods2.setT(new Pencil());  //입력 매개변수에서 객체 생성
        Pencil pencil = goods2.getT();

        //3. 잘못된 타입 선언
        Goods<Apple> goods3 = new Goods<>();
        goods3.setT(new Apple());
        // Pencil pencil2 = goods3.getT();  //강한 타입 체크로 문법 오류 발생
    }
}