package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingLambdaInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(90);
        numbers.add(76);
        numbers.add(98);
        numbers.add(65);
        System.out.println("Numbers Before Sorting:-"+numbers);
        Collections.sort(numbers);
        Collections.sort(numbers,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("Numbers in sorted descending order :- ");
        numbers.forEach(num ->System.out.println(num));

    }
}
