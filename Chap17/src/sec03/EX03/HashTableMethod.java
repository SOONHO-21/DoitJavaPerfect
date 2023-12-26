package sec03.EX03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
    public static void main(String[] args) {
        Map<Integer, String> htable1 = new Hashtable<>();
        htable1.put(2, "나다라");
        htable1.put(1, "가나다");
        htable1.put(3, "다라마");
        System.out.println(htable1.toString());

        //2.putAll(다른 맵 객체)
        Map<Integer, String> htable2 = new Hashtable<>();
        htable2.putAll(htable1);
        System.out.println(htable2.toString());
        //3. replace
        htable2.replace(1, "가가가");
        htable2.replace(2, "나다라", "나나나");
        System.out.println(htable2.toString());

        System.out.println(htable2.get(1));
        System.out.println(htable2.get(2));
        System.out.println(htable2.get(3));

        System.out.println(htable2.containsKey(1));
        System.out.println(htable2.containsKey(5));

        System.out.println(htable2.containsValue("나나나"));
        System.out.println(htable2.containsValue("dfasf"));

        Set<Integer> keySet = htable2.keySet();
        System.out.println(keySet.toString());

        Set<Map.Entry<Integer, String>> entrySet = htable2.entrySet();
        System.out.println(entrySet.toString());
        htable2.remove(1);
        htable2.remove(2, "나나나");
        System.out.println(htable2.toString());
        htable2.clear();
        System.out.println(htable2.toString());
    }
}