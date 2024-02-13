/* Author: Aaron Capron
   Personal Project
   Last Updated: 2/12/2024
   This code sums all integer values between an upper bound and a lower bound,
   both of which are variables set by user
*/
import java.util.Scanner;
public class intAdd2{
   public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);
      int lowerBound = scanner.nextInt();
      int upperBound = scanner.nextInt();
      
      int sum = 0;

      for(int i=lowerBound;i<=upperBound;i++) {
         sum+=i;
      }System.out.println("sum = " + sum);
   }
}