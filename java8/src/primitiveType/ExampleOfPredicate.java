package primitiveType;

import java.util.function.IntPredicate;

public class ExampleOfPredicate {

    public static void main(String[] args)
    {
        int[] x ={45,78,65,90,10,8};
        IntPredicate p= i->i%2==0;
        for (int x1 : x)
        {
            if(p.test(x1))
            {
                System.out.println("Numbers Which is Dived by 0"+x1);
            }
        }
    }
    public  static void stringPredicate()
    {

    }
}
