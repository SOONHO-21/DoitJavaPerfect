package sec05.EX02;

class Parent {
    <T extends Number> void print(T t){
        System.out.println(t);
    }
}
class Child extends Parent {

}
public class InheritanceGenericMethod {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.<Integer>print(10);
        p.print(20);

        Child c = new Child();
        c.<Double>print(3.8);
        c.print(5.8);
    }
}