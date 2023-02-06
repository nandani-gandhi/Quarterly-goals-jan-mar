package lambdaExpressions;

interface Sum {
    int totalSum(int a, int b);
    default void addNumbers(int g, int h) {
    }
}
@FunctionalInterface
interface Calculate extends Sum
{
    int totalSum(int a ,int b);
}
public class SimpleExampleOfLambda  {
    public static void main(String[] args) {
        int x= 20;
        int y= 30;
        Calculate calculate = (a, b) -> (a + b);
        System.out.println("Sum of X and Y: "+calculate.totalSum(x, y));
    }


}

