package sec03.EX02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A {
    int data;

    public A(int data) {
        this.data = data;
    }
}
class B {
    int data;

    public B(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof B)    //들어온 객체가 class B객체가 맞으면
            if(this.data == ((B)obj).data)  //그 다음 데이터를 비교 해라
                return true;
        return false;
    }
}
class C {
    int data;

    public C(int data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof C)    //들어온 객체가 class C객체가 맞으면
            if(this.data == ((C)obj).data)  //그 다음 데이터를 비교 해라
                return true;
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
public class HashMapMachanism {
    public static void main(String[] args) {
        Map<A, String> hashMap1 = new HashMap<>();
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println();

        Map<B, String> hashMap2 = new HashMap<>();
        B b1 = new B(3);
        B b2 = new B(3);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        hashMap2.put(b1, "esfj");
        hashMap2.put(b2, "isfj");
        System.out.println(hashMap2.size());
        System.out.println();

        Map<C, String> hashMap3 = new HashMap<>();
        C c1 = new C(3);
        C c2 = new C(3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode() + ", " + c2.hashCode());
        hashMap3.put(c1, "첫 번째");
        hashMap3.put(c1, "두 번째");
        System.out.println(hashMap3.size());
    }
}