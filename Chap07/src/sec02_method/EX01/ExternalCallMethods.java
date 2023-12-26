package sec02_method.EX01;

class A{
    void print(){
        System.out.println("안녕");
    }
    //리턴 타입 int, 입력매개변수 없음
    int data(){
        return 3;
    }
    //리턴타입 double, 매개면수 2
    double sum(int a, double b){
        return a+b;
    }

    void printMonth(int m) {
        if(m < 0 || m > 12){
            System.out.println("잘못 된 입력");
            return;
        }
        System.out.println(m + "월 입니다.");
    }
}
public class ExternalCallMethods {
    public static void main(String[] args){
        A a = new A();

        //메소드 호출(멤버 활용)
        a.print();
        int k = a.data();

        a.data();
        System.out.println(k);
        double result = a.sum(3, 5.2);
        a.printMonth(5);
        a.printMonth(15);
    }
}