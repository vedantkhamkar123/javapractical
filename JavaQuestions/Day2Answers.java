// 1.Write a java program to accept two byte value for the user and the summation of no between them.
import java.util.Scanner;
class sumation {
        public static void main(String[] args) {
                byte firstvalue, secondvalue;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter firstvalue=");
                firstvalue = sc.nextByte();
                System.out.print("Enter secondvalue=");
                secondvalue = sc.nextByte();
                if (firstvalue > secondvalue) {
                        System.out.println("Error:first byte should be less than the second byte.");
                } else {
                        int n=secondvalue-firstvalue+1;
                        int sum = n*(n+1)/2;
                        System.out.println("sum of numbers between=" + firstvalue + " and " + secondvalue + " is " + sum);
                }
        }
}

/*          Output
  Enter firstvalue=20
Enter secondvalue=30
sum of numbers between=20 and 30 is 66
*/
