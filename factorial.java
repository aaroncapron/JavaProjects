/* Author: Aaron Capron
   Personal Project
   Last Updated: 2/12/2024
   This program computes the factorial of user-input variable n
*/
import java.util.Scanner;
public class factorial{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int factorial = 1;

		for (int i = n; i >= 1; i--) {
			if (i == 0) {
				fact = fact * 1;
			}else{
				fact = fact * i;
			}
		}
		System.out.println(“factorial = ” + factorial);
	}
}