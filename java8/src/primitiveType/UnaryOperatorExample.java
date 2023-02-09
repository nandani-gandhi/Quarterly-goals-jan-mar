package primitiveType;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> f = i -> i * i;
        System.out.println("square of Number :"+f.apply(6));
        IntUnaryOperator f2 = i -> i + 2;
        System.out.println("Number added by 2"+f2.applyAsInt(4));
    }
}
