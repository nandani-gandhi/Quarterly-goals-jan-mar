package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String args[]) {
     
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

        copyOnWriteArrayList.add("Car");
        copyOnWriteArrayList.add("Bus");
        copyOnWriteArrayList.add("Scouter");
        copyOnWriteArrayList.add("Rickshaw");
        copyOnWriteArrayList.add("Active");
        copyOnWriteArrayList.add("Tractor");
        copyOnWriteArrayList.add(1, "Tempo");
        copyOnWriteArrayList.remove("Active");
        copyOnWriteArrayList.remove(2);
        System.out.println("Data of ArrayList: " + copyOnWriteArrayList);
        try
        {
            Iterator<String> iterator = copyOnWriteArrayList.iterator();
            while(iterator.hasNext())
            {
                iterator.remove();
            }
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("Method not supported Because at the time of iteration elements can not remove");
        }
        System.out.println("Size of ArrayList: " + copyOnWriteArrayList.size() + " Data of ArrayList: " + copyOnWriteArrayList);
        System.out.println("Index of Method: "+copyOnWriteArrayList.indexOf("Tempo"));
    }
}
