package Predicate;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args)
    {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println("Is given number is Grater than 10 and also less Than 20 :"+result);

        boolean result2 = greaterThanTen.or(lowerThanTwenty).test(25);
        System.out.println("Is given number is Grater than 10 or less Than 20 :"+result2);

        boolean result3 = greaterThanTen.negate().test(5);
        System.out.println(result3);

    }
}
