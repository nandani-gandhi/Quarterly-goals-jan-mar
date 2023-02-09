package primitiveType;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args)
    {
        ToIntFunction<String> f= s->s.length();
        System.out.println("Length of String :"+f.applyAsInt("Nanadni"));
        IntFunction<Integer> f1= i->i*i;
        System.out.println("Square of Number is: "+f1.apply(5));
    }
}
