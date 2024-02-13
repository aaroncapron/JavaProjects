/* Author: Aaron Capron
   Personal Project
   This program sums all the numbers in the range provided by user-input (lowerBound, upperBound)
   Last Updated: 2/12/2024
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
