package generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionVsArray {
    public static void main(String[] args) {
        //Array
        String[] strings = new String[10];
        strings[0] = "Nandani";
        strings[1] = "Lina";
        //strings[2] = new Integer(100);
        System.out.println("Strings data is: "+strings );

        //Collection
        List<Object> list = new ArrayList<>();
        list.add("Nandani");
        list.add("vivek");
        list.add(2);
        System.out.println(list);
        String name1 = (String) list.get(1);
        System.out.println("Name at 1 index :"+name1);
        int value = (int)list.get(2);
        System.out.println("value is: "+ value);
    }
}
