package sec02.EX03;

import java.util.*;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        Set<String> linkedSet1 = new LinkedHashSet<>();
        //1. add(E element)
        linkedSet1.add("가");
        linkedSet1.add("나");
        linkedSet1.add("가");
        System.out.println(linkedSet1.toString());

        Set<String> linkedSet2 = new LinkedHashSet<>();
        linkedSet2.add("나");
        linkedSet2.add("다");
        linkedSet2.addAll(linkedSet1);
        System.out.println(linkedSet2.toString());
        linkedSet2.remove("나");
        System.out.println(linkedSet2.toString());

        Iterator<String> iterator = linkedSet2.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Object[] objArray = linkedSet2.toArray();
        System.out.println(Arrays.toString(objArray));

        //특정 타입의 배열로 쓰려면 다운캐스팅 필수
        String[] strArray1 = linkedSet2.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray1));

        String[] strArray2 = linkedSet2.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2));
    }
}