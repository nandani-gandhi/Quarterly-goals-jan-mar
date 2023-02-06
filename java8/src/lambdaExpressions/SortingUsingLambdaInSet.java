package lambdaExpressions;

import java.util.Set;
import java.util.TreeSet;

public class SortingUsingLambdaInSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        numbers.add(90);
        numbers.add(76);
        numbers.add(98);
        numbers.add(65);
        System.out.println("Numbers in sorted descending order :-");
        numbers.stream().forEach(num -> System.out.println(num));


    }
}
