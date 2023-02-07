package Predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    static Boolean checkAge(int age){
        if(age>15)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args){

        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;

        boolean result = predicate.test(25);
        if(result)
        {
            System.out.println("Candidate Age is More than 18");
        }
        else
        {
            System.out.println("Candidate Age is Less than 18");
        }
    }
}
