package sec04_thiskeyword.EX01;

class A {
    int m;
    int n;
    void init(int m, int n){
        m = m;
        n = n;
    }
}
class B {
    int m;
    int n;
    void init(int m, int n){
        this.m = m;
        this.n = n;
    }
}
public class ThisKeyword_1 {
    public static void main(String[] args){
        A a = new A();
        a.init(1,2);
        System.out.println(a.m + ", " + a.n);

        B b = new B();
        b.init(1,2);
        System.out.println(b.m + ", " + b.n);
    }
}