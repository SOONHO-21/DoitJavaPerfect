package sec02.EX04;

import java.util.*;

public class TreeSetMethod_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=50; i>0; i -= 2)
            treeSet.add(i);

        System.out.println(treeSet.toString());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower(10));  //8
        System.out.println(treeSet.higher(10)); //12
        System.out.println(treeSet.floor(25));  //24. 있는 수 중 이하 가장 큰수
        System.out.println(treeSet.floor(26));  //26
        System.out.println(treeSet.ceiling(25));  //26
        System.out.println(treeSet.ceiling(26));  //26
        System.out.println();

        int treeSetSize = treeSet.size();
        System.out.println(treeSetSize);
        for (int i=0; i<treeSetSize; i++)
            System.out.print(treeSet.pollFirst() + " ");
        System.out.println();

        for(int i=50; i>0; i -= 2)
            treeSet.add(i);
        for (int i=0; i<treeSetSize; i++)
            System.out.print(treeSet.pollLast() + " ");
        System.out.println();

        for(int i=50; i>0; i -= 2)
            treeSet.add(i);

        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet.toString());
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet.toString());
        nSet = treeSet.headSet(20, false);
        System.out.println(nSet.toString());
        sSet = treeSet.tailSet(20);
        System.out.println(sSet.toString());
        sSet = treeSet.tailSet(20, true);   //이상
        System.out.println(sSet.toString());
        sSet = treeSet.tailSet(20, false);  //초과
        System.out.println(sSet.toString());

        sSet = treeSet.subSet(10, 20);
        System.out.println(sSet.toString());

        nSet = treeSet.subSet(10, true, 20, false);
        System.out.println(nSet.toString());
        nSet = treeSet.subSet(10, false, 20, true);
        System.out.println(nSet.toString());
        NavigableSet<Integer> dcSet = treeSet.descendingSet();
        System.out.println(dcSet.toString());
        dcSet = dcSet.descendingSet();
        System.out.println(dcSet.toString());
    }
}