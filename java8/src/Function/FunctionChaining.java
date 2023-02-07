package Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args)
    {
        Function<String,String> f1= s->s.toUpperCase();
        Function<String,String> f2= s->s.replace("Aishwarya","Nandani");
        Function<Integer,Integer> f3 = i -> i+i;
        Function<Integer,Integer> f4 = i -> i*i*i;

        System.out.println(" Result of f1:"+f1.apply("Aishwarya Rai"));
        System.out.println(" Result of f2:"+f2.apply("Aishwarya Rai"));
        System.out.println(" Result of f1.andThen(f2):"+f1.andThen(f2).apply("Aishwarya Rai"));
        System.out.println(" Result of f1.compose(f2):"+f1.compose(f2).apply("Aishwarya Rai"));
        System.out.println(" Result of andThan od f3 and f4 :- "+f3.andThen(f4).apply(2));
    }
}
