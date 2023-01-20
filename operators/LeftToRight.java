/*  The + operator is left to right.
 So the left one expression is evaluated as (10 + 20) + “Nandani” and
 second expression is evaluated as (“Nandani” + 10) + 20 .
*/

package operators;

public class LeftToRight {
    public static void main(String args[])  {
        System.out.println(10  +  20 + "Nandani");
        System.out.println("Nandani" + 10 + 20);
    }
}
