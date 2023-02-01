package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(13);
        list.add(56);
        list.add(89);
        list.add(90);
        list.add(34);

        for (Integer value : list) {
            System.out.println("Value is :" + value);
            if (value.equals(89))
            {
                list.remove(value);
            }
        }

    }

}
