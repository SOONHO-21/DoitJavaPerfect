package sec03.EX01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> hmap1 = new HashMap<>();
        hmap1.put(2, "나다라");
        hmap1.put(1, "가나다");
        hmap1.put(3, "다라마");
        System.out.println(hmap1.toString());

        //2.putAll(다른 맵 객체)
        Map<Integer, String> hmap2 = new HashMap<>();
        hmap2.putAll(hmap1);
        System.out.println(hmap2.toString());
        //3. replace
        hmap2.replace(1, "가가가");
        hmap2.replace(2, "나다라", "나나나");
        System.out.println(hmap2.toString());

        System.out.println(hmap2.get(1));
        System.out.println(hmap2.get(2));
        System.out.println(hmap2.get(3));

        System.out.println(hmap2.containsKey(1));
        System.out.println(hmap2.containsKey(5));

        System.out.println(hmap2.containsValue("나나나"));
        System.out.println(hmap2.containsValue("dfasf"));

        Set<Integer> keySet = hmap2.keySet();
        System.out.println(keySet.toString());

        Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();
        System.out.println(entrySet.toString());
        hmap2.remove(1);
        hmap2.remove(2, "나나나");
        System.out.println(hmap2.toString());
        hmap2.clear();
        System.out.println(hmap2.toString());
    }
}
