package supplier;

import java.util.function.Supplier;

public class RandomNumbersGenerator {
    public static void main(String[] args)
    {
        Supplier<String> otps=()->{
            String otp="";
            for(int i =1;i<=6;i++)
            {
                otp= otp +(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("Your Otp is: "+otps.get());
    }
}
