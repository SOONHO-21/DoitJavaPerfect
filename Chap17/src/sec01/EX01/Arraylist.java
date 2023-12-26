package sec01.EX01;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        alist.add("가");     alist.add("나");
        alist.add("다");     alist.add("라");
        alist.add("마");     alist.add("바");
        alist.add("사");
        System.out.println(alist.size());
        alist.remove("다");
        alist.remove("바");
        System.out.println(alist.size());
        System.out.println(alist);
    }
}