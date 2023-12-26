package sec03.EX05;

import java.util.*;

public class TreeMapMethod_1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for(int i=20; i>0; i-=2)
            treeMap.put(i, i + "번째 데이터");
        System.out.println(treeMap.toString());
        //firstKey
        System.out.println(treeMap.firstKey());
        //firstEntry
        System.out.println(treeMap.firstEntry());
        //lastKey
        System.out.println(treeMap.lastKey());
        //lastEntry
        System.out.println(treeMap.lastEntry());
        //higherKey
        System.out.println(treeMap.higherKey(10));
        System.out.println(treeMap.higherKey(11));
        //lowerKey
        System.out.println(treeMap.lowerKey(10));
        System.out.println(treeMap.lowerKey(9));
        //pollFirstEntry
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.toString());
        //SortedMap<K, V>
        SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
        System.out.println(sortedMap.toString());
        //
        NavigableMap<Integer, String> navigableMap = treeMap.headMap(8, true);
        System.out.println(navigableMap.toString());

        sortedMap = treeMap.tailMap(8);
        System.out.println(sortedMap.toString());
        navigableMap = treeMap.tailMap(8, false);
        System.out.println(navigableMap.toString());

        sortedMap = treeMap.subMap(6, 10);
        System.out.println(sortedMap);
        navigableMap = treeMap.subMap(6, false, 10, true);
        System.out.println(navigableMap);

        NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
        System.out.println(navigableSet.toString());
        System.out.println(navigableSet.descendingSet());
        navigableMap = treeMap.descendingMap();
        System.out.println(navigableMap.toString());
        System.out.println(navigableMap.descendingMap());
    }
}