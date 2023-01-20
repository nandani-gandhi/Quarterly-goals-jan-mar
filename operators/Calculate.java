/*
Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5
*/

package operators;

public class Calculate {
    public static void main(String[] args){
        int n, first, second, third, forth, fifth, sum;
        n = 23462;

        first = n/10000;     //first digit
        n = n%10000;

        second = n/1000;     //second digit
        n = n%1000;

        third = n/100;       //third digit
        n = n%100;

        forth = n/10;        //forth digit
        fifth = n%10;        //fifth digit

        sum = first + forth;
        System.out.println("sum : "+sum);
    }
}
