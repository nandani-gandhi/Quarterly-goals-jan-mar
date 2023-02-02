package generics;

public class MultipleUpperBound {

    public static void main(String[] args) {
        System.out.println("Max number is: "+findMax(20,10));
    }
    public static <T extends Number & Comparable > T findMax(T t1,T t2)
    {
        T max = t1;
        if(t2.compareTo(t1)>0)
        {
            t2=max;
        }
        return max;
    }

}
