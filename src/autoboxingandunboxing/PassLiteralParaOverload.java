package autoboxingandunboxing;

class PrimitiveTypeClass {
    public void primitiveType (byte x)
    {
        System.out.println("byte x: " + x);
    }

    public void primitiveType (short x)
    {
        System.out.println("short x: " + x);
    }

    public void primitiveType (int x)
    {
        System.out.println("int x: " + x);
    }

    public void primitiveType (long x)
    {
        System.out.println("long x: " + x);
    }

    public void primitiveType (float x)
    {
        System.out.println("float x: " + x);
    }

    public void primitiveType (double x)
    {
        System.out.println("double x: " + x);
    }
}

public class PassLiteralParaOverload
{
    public static void main (String[] args)
    {
        PrimitiveTypeClass primitiveTypeClass = new PrimitiveTypeClass();
        primitiveTypeClass.primitiveType((long)(10)); //long version will be called
        primitiveTypeClass.primitiveType(10); //int version will be called, default is int
        primitiveTypeClass.primitiveType((short)(10)); //short version will be called
        primitiveTypeClass.primitiveType((byte)(10)); //byte version will be called
        primitiveTypeClass.primitiveType(10.00); //double version will be called, default is double
        primitiveTypeClass.primitiveType(10.00f); //float version will be called
        float f = 10;
        primitiveTypeClass.primitiveType(f); //float version will be called
        double d = 10;
        primitiveTypeClass.primitiveType(d); //double version will be called
    }
}
