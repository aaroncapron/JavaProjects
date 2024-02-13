/* Author: Aaron Capron
   Personal Project
   This program sums all even values between a lower and upper bound set by user-input
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class intSum3{
	public static void main(String [] args) {
 		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
 		int start = scanner.nextInt();
 		System.out.print("Enter the second integer: ");
 		int end = scanner.nextInt();

 		int sum = 0;
    	for(int i = start;i <= end;i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}System.out.println("sum = " + sum);
	}
}