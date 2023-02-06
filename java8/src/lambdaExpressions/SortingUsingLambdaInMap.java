package lambdaExpressions;

import java.util.Map;
import java.util.TreeMap;

public class SortingUsingLambdaInMap {
    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        treeMap.put(90,"Book");
        treeMap.put(76,"Pen");
        treeMap.put(98,"Paper");
        treeMap.put(65,"Pencil");
        System.out.println("TreeMap After Sorting in descending order:-");
        treeMap.forEach((key,value)-> System.out.println("key is "+ key + " value is :-"+value));

    }
}
