/* Author: Aaron Capron
   Instructor: Prof. Daniel Meija
   CS 1301
   This program asks user for a name and prints it until "END" is printed, ending the loop
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class nameDone{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?: ");
		String name = scanner.nextLine();

		while (!name.equals ("END")) {
			System.out.println(" ");
			System.out.println(name);
			System.out.println("What is your name?: ");
			name = scanner.nextLine();
		}System.out.println("I am done.");
		scanner.close();
	}
}
