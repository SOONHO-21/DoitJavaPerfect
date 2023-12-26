package sec02.EX02;

import java.security.Key;

class KeyValue<K ,V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class TwoGenericArguments {
    public static void main(String[] args) {
        KeyValue<String, Integer> keyValue1 = new KeyValue<>();
        keyValue1.setKey("사과");
        keyValue1.setValue(1000);
        String key1 = keyValue1.getKey();
        int value1 = keyValue1.getValue();
        System.out.println(key1 + ", " + value1);

        //Void는 해당 제네릭 타입의 변수를 사용 않겠다는 의미
        KeyValue<String, Void> keyValue3 = new KeyValue<>();
        keyValue3.setKey("키 값만 사용");
        String key2 = keyValue3.getKey();
        System.out.println(key2);
    }
}