package primitiveType;


import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args)
 {
     BinaryOperator<String> f=(s1, s2)->s1+s2;
     System.out.println(f.apply("Nandani","Gandhi"));
     IntBinaryOperator b=(i1, i2)->i1+i2;
     System.out.println(b.applyAsInt(10,20));

 }
}
