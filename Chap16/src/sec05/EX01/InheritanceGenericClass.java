package sec05.EX01;

class Parent<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class Child1<T> extends Parent<T> {

}
class Child2<T, V> extends Parent<T> {
    private V v;
    public V getV() {
        return v;
    }
    public void setV(V v) {
        this.v = v;
    }
}
public class InheritanceGenericClass {
    public static void main(String[] args) {
        Parent<String> p = new Parent<>();
        p.setT("부모의 제네릭 클래스");
        System.out.println(p.getT());

        System.out.println();

        Child1<Integer> c1 = new Child1<>();
        Child1<String> c2 = new Child1<>();
        c1.setT(10);
        c2.setT("자식의 제네릭 클래스1");
        System.out.println(c1.getT());
        System.out.println(c2.getT());

        System.out.println();

        Child2<String, Integer> c3 = new Child2<>();
        c3.setT("자식의 제네릭 클래스2");
        c3.setV(10);
        System.out.println(c3.getT());
        System.out.println(c3.getV());
    }
}