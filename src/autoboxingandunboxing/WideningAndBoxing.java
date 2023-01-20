package autoboxingandunboxing;

public class WideningAndBoxing {
    public static void main (String[] args)
    {
        byte b = 5;

        // b is first widened to Byte and then Byte passed to Object
        aMethod(b);
    }

    static void aMethod (Object b)
    {
        //Object b is typecasted to Byte and then printed
        Byte bb = (Byte)b;
        System.out.println("b: " + bb);
    }
}
