/* Author: Aaron Capron
   Personal Project
   This program extracts each digit from user-input variable 'n', but in reverse order
   For example, if n = 53412, the output you should produce is "2 1 4 3 5" exactly
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class reverseInt{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
      	System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Digits in reverse order: ");
        while (n != 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }scanner.close();
   }
}