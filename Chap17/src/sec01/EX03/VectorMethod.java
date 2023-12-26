package sec01.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
        List<Integer> vlist = new Vector<>();
        //1. add
        vlist.add(3);
        vlist.add(4);
        vlist.add(5);
        System.out.println(vlist.toString());
        //2.add(int index, E element)
        vlist.add(1,6);
        System.out.println(vlist.toString());
        //3. addAll(또 다른 리스트 이름)
        List<Integer> vlist2 = new Vector<>();
        vlist2.add(1);
        vlist2.add(2);
        vlist2.addAll(vlist);
        System.out.println(vlist2.toString());
        List<Integer> vlist3 = new Vector<>();
        vlist3.add(1);
        vlist3.add(2);
        vlist3.addAll(vlist);
        vlist3.set(1, 7);
        vlist3.set(3, 9);
        System.out.println(vlist3.toString());
        vlist3.remove(1);
        System.out.println(vlist3);
        vlist3.remove(new Integer(3));  //숫자 3을 삭제
        System.out.println(vlist3);
        vlist3.clear();
        System.out.println(vlist3);
        System.out.println(vlist3.isEmpty());

        vlist3.add(1);
        vlist3.add(2);
        vlist3.add(3);
        for(int i=0; i<vlist3.size(); i++)
            System.out.print(vlist3.get(i) + " ");
        System.out.println();

        Object[] obj = vlist3.toArray();
        Integer[] integer1 = vlist3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1));
        Integer[] integer2 = vlist3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2));
    }
}