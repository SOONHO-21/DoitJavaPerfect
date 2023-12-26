package sec01_accessmodifier.EX01.pack02;

import sec01_accessmodifier.EX01.pack01.A;

public class D extends A {
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");  //자식 클래스는 임포트하면 protected 까진 타 패키지에서 접근 가능
//        System.out.print(c + " ");
//        System.out.print(d + " ");
        System.out.println();
    }
}
