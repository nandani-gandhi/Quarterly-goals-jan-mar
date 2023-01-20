package autoboxingandunboxing;

public class BoxingInMethod {
    // autoboxing in parameters
    static int plus(Integer x, Integer y) {
        // unboxing in return
        return x+y;
    }
    public static void main(String args[]) {

        int sum = plus(20,80);

        System.out.println("sum = "+sum);

    }
}
