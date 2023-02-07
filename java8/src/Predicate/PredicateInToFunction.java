package Predicate;

import java.util.function.Predicate;

public class PredicateInToFunction {
    static void predicateNum(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number is bigger than 5 :- " + number);
        }
        else
        {
            System.out.println("Number is less than 5");
        }
    }
    public static void main(String[] args)
    {
        predicateNum(2, (i) -> (i > 7));
        predicateNum(10, (i) -> (i > 7));
    }
}
