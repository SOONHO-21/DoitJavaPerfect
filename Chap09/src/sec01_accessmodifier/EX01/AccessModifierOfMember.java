package sec01_accessmodifier.EX01;

import sec01_accessmodifier.EX01.pack01.A;
import sec01_accessmodifier.EX01.pack01.B;
import sec01_accessmodifier.EX01.pack02.C;
import sec01_accessmodifier.EX01.pack02.D;

public class AccessModifierOfMember {
    public static void main(String[] args){
        A a = new A();  //1 2 3 4
        B b = new B();  // 1 2 3
        C c = new C();  // 1
        D d = new D();  // 1 2

        a.print();
        b.print();
        c.print();
        d.print();
    }
}