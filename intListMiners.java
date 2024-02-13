/* Author: Aaron Capron
   Personal Project
   This program asks user for upper and lower bounds to print out integer values in-between
   This time, every multiple of 3 prints "UTEP" and every multiple of 5 prints "Miners"
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class intListMiners{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		// ASKS FOR LOWER AND UPPER BOUNDS
		System.out.println("Enter a lower bound: ");
		int lowerBound = scanner.nextInt();
		System.out.println(" ");
		System.out.println("Enter an upper bound: ");
		int upperBound = scanner.nextInt();
		System.out.println(" ");
		// BECAUSE Y'ALL CAN BE CHILDISH AND ENTER '69'
		if (lowerBound == 69 || upperBound == 69) {
			System.out.println("childish\n");
		}
		// RUNS A FOR LOOP TO DETERMINE IF NUMBERS BETWEEN THE BOUNDS
		// ARE DIVISIBLE BY 3 OR 5, PRINTS RESPECTIVE OUTPUTS
		for (int i = lowerBound; i < upperBound; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
             System.out.print("UTEP ");
         } else if (i % 3 == 0) {
             System.out.print("UTEP ");
         } else if (i % 5 == 0) {
             System.out.print("Miners ");
         } else {
             System.out.print(i + " ");
         }
      }
	}
}
