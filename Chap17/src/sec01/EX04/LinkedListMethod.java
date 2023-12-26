package sec01.EX04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod {
    public static void main(String[] args) {
        List<Integer> linkedList1 = new LinkedList<>();
        //1. add
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        System.out.println(linkedList1.toString());
        //2.add(int index, E element)
        linkedList1.add(1,6);
        System.out.println(linkedList1.toString());
        //3. addAll(또 다른 리스트 이름)
        List<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2.toString());
        List<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.addAll(linkedList1);
        linkedList3.set(1, 7);
        linkedList3.set(3, 9);
        System.out.println(linkedList3.toString());
        linkedList3.remove(1);
        System.out.println(linkedList3);
        linkedList3.remove(new Integer(3));  //숫자 3을 삭제
        System.out.println(linkedList3);
        linkedList3.clear();
        System.out.println(linkedList3);
        System.out.println(linkedList3.isEmpty());

        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.add(3);
        for(int i=0; i<linkedList3.size(); i++)
            System.out.print(linkedList3.get(i) + " ");
        System.out.println();

        Object[] obj = linkedList3.toArray();
        Integer[] integer1 = linkedList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1));
        Integer[] integer2 = linkedList3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2));
    }
}
