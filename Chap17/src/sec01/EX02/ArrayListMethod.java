package sec01.EX02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        //1. add
        alist.add(3);
        alist.add(4);
        alist.add(5);
        System.out.println(alist.toString());
        //2.add(int index, E element)
        alist.add(1,6);
        System.out.println(alist.toString());
        //3. addAll(또 다른 리스트 이름)
        List<Integer> alist2 = new ArrayList<>();
        alist2.add(1);
        alist2.add(2);
        alist2.addAll(alist);
        System.out.println(alist2.toString());
        List<Integer> alist3 = new ArrayList<>();
        alist3.add(1);
        alist3.add(2);
        alist3.addAll(alist);
        alist3.set(1, 7);
        alist3.set(3, 9);
        System.out.println(alist3.toString());
        alist3.remove(1);
        System.out.println(alist3);
        alist3.remove(new Integer(3));  //숫자 3을 삭제
        System.out.println(alist3);
        alist3.clear();
        System.out.println(alist3);
        System.out.println(alist3.isEmpty());

        alist3.add(1);
        alist3.add(2);
        alist3.add(3);
        for(int i=0; i<alist3.size(); i++)
            System.out.print(alist3.get(i) + " ");
        System.out.println();

        Object[] obj = alist3.toArray();
        Integer[] integer1 = alist3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1));
        Integer[] integer2 = alist3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2));
    }
}
