package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExampleWithVoid {

    public static void main(String[] args) {

        Character[] charArray = new Character[]{'A','B','C'};
        Integer[] intArray = new Integer[]{1,2,3,4};
        String[] stringArray = new String[]{"Nandani","Hetvi","Harsh"};
        printData(stringArray);
        printData(intArray);
        printData(charArray);
    }

    //syntax
    public static <T> void printData(T[] t){
        for(T data : t){
            System.out.println("Data Which is inserted in Array is : "+data);
        }
    }

}
