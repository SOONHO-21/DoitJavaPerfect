package sec02_method.EX02;

public class InternalCallMethods {
    public static void main(String[] args){
        print();

        int n = 3;
        int a = twice(n);
        System.out.println(a);

        double b = sum(3, 5.2);
        System.out.println(b);
    }

    public static void print(){
        System.out.println("안녕");
    }

    public static int twice(int k){
        return k * 2;
    }

    public static double sum(int m, double n){
        return m + n;
    }
}