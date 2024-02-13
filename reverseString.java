/* Author: Aaron Capron
   Personal Project
   This program will reverse user-input strings
   Last modified: 2/9/2024
*/
import java.util.Scanner;
public class reverseString {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please type in a string: ");
		String stringinput = input.next();

		char[] resultarray = stringinput.toCharArray();
       		for (int i = resultarray.length - 1; i >= 0; i--) {
			System.out.print(resultarray[i]);
		}
	}
}
