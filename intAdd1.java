/* Author: Aaron Capron
   Personal Project
   Last Updated: 2/12/2024
   This program continuously ask for an integer until you enter a negative integer
   Then, it prints the sum of all entered numbers (not including negative integer)
*/
import java.util.Scanner;
public class intAdd1{
   public static void main(String [] args) {
      int number = 0;
      int counter = 0;
      int sum = 0;

      String promptMsg = "Enter a positive integer (negative to quit): ";
      System.out.println(promptMsg);

      Scanner input = new Scanner(System.in);
      number = input.nextInt();
      while (number >= 0) {
      counter++;
         sum += number;
         System.out.println(promptMsg);
         number = input.nextInt();
      }
      System.out.println("This is the sum: " + sum);
      input.close();
   }
}
