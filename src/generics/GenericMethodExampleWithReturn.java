package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodExampleWithReturn {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = map(1,"Nandani");
        System.out.println(integerStringMap);
        Map<String,String> stringStringMap = map("S001","Nandani");
        System.out.println(stringStringMap);
    }

    //syntax
    public static <K,V> Map <K,V> map(K key , V value)
    {
        Map<K,V> map = new HashMap<>();
        map.put(key,value);
        return map;

    }
}
