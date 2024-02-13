/* Author: Aaron Capron
   Personal Project
   This program computes the Collatz Conjecture of user-input variable 'n'
   If n is even, divide by 2 to get n / 2
   If n is odd, multiply by 3 and add 1 to obtain 3n + 1. 
   Repeat the process until you reach 1
   No matter what number you start with, you will eventually reach 1
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class collatzConjecture{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
      	System.out.print("Starting Number: ");
      	int n = scanner.nextInt();
      	int stepsTaken = 1;
     	 int largestNumber = 0;
     	 System.out.println();

      	while ( n != 1 ) {
     	 stepsTaken++;
        if (n % 2 == 0) {
            n = n / 2;
				System.out.print(n + " ");
        }else {
         	n = (n * 3) + 1;
           	System.out.print( n + " " );
        }if ( n > largestNumber ) {
            largestNumber = n;
        }if (stepsTaken % 9 == 0) {
            System.out.print("\n");
        }
    }
      System.out.println();
      System.out.println("\nTerminated after " + stepsTaken + " steps.");
      System.out.println("The largest value was " + largestNumber + ".");
 	scanner.close();
   }
}	