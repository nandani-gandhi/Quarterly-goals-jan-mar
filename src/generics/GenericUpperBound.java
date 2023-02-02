package generics;

public class GenericUpperBound {
    public static void main(String[] args)
    {
        numberOnly(10);
        System.out.println("Minimum Number is: "+compareMethod(90, 10));
        String max = FindMaximum.findMax("Nandani", "Jay", "Uday");
        int intMax= FindMaximum.findMax(12,90,78);
        System.out.println("Who comes last?: "+max);
        System.out.println("Max number is:"+intMax);
    }
    public static <T extends Number> void numberOnly(T t)
    {
        System.out.println(t+" is type of :"+t.getClass().getSimpleName());
    }
    public static <T extends Comparable> T compareMethod(T t1, T t2)
    {
        return t1.compareTo(t2) < 0 ? t1:t2;
    }
}
class FindMaximum{
    public static <T extends Comparable> T findMax(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max)>0)
            max = t2;
        if(t3.compareTo(max)>0)
            max = t3;
        return max;
    }
}
