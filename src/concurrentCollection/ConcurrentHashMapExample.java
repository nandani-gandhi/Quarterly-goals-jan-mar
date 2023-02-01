package concurrentCollection;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer, String> concurrentHashMap
                = new ConcurrentHashMap<>();
        concurrentHashMap.put(101, "Keval");
        concurrentHashMap.put(100, "Nandani");
        concurrentHashMap.put(102, "Aditi");
        concurrentHashMap.putIfAbsent(101, "Dhruv");
        concurrentHashMap.remove(101, "Nandani");
        concurrentHashMap.replace(101, "Nikita", "Parth");
        for(Integer integer: concurrentHashMap.keySet())
        {
            concurrentHashMap.remove(100);
            System.out.println("Key is : "+ integer + " Value is : " + concurrentHashMap.get(integer));
            concurrentHashMap.putIfAbsent(103, "Dhruv");

        }
    }
}
