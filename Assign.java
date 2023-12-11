package Assignment;

import java.util.Scanner;
public class Assign {

    public static void main(String[] args) {
        int n = 56;

        System.out.println(n);
        int m=69;
        System.out.println("Addition of number "+n+" + "+m+" = "+(n+m));

        float a=4.6f;
        float b=7.6f;
        System.out.println(a*b);

        char ch='D';
        int z=ch;
        System.out.println("ASCII no of "+ch+ " is " +z);

        int divisor=7,divident = 21;
        int Quotient=divident/divisor;
        int Reminder=divident%divisor;
        System.out.println("Quotient is "+Quotient);
        System.out.println("Reminder is "+Reminder);

        int v=87;
        int s=45;
        System.out.println("original values  v="+v+" s="+s);
        int temp;
        temp=v;
        v=s;
        s=temp;
        System.out.println("after a swapping v="+v+" s="+s);
    }
}