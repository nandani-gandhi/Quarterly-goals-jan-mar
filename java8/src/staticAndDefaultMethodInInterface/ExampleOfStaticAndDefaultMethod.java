package staticAndDefaultMethodInInterface;

interface MyInterface{
    public static int first = 100;
    public static int second= 200;
    default int SumOfTwoNum() {
        return first+second;
    }
    static void displayTotal(int total)
    {
        System.out.println("Sum of num1 and num2 value:-" + total);
    }
}
public class ExampleOfStaticAndDefaultMethod implements MyInterface {
    public static void main(String[] args) {
        ExampleOfStaticAndDefaultMethod obj = new ExampleOfStaticAndDefaultMethod();
        int total = obj.SumOfTwoNum();
        MyInterface.displayTotal(total);
    }

}
