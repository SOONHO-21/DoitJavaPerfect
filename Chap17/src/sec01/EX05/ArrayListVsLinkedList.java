package sec01.EX05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long startTime = 0, endTime = 0;

        for(int i=0; i<10000; i++) {
            list1.add(i);
        }
        for(int i=0; i<10000; i++) {
            list2.add(i);
        }

        //ArrayList 데이터 검색 시간
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list1.get(i);
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        //LinkedList 데이터 검색 시간
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list2.get(i);
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}