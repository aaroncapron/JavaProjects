/* Author: Aaron Capron
   Personal Project
   This program computes all leap years between 1752 < year > 9999
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class leapYear{
	public static void main(String [] args) {
 		int j = 0;
      	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the starting year: ");
 		int startYear = scanner.nextInt();
 		while (startYear < 0) {
        	System.out.println("The Gregorian Calendar wasn't even invented until 1752.\nTry again.");
         	startYear = scanner.nextInt();
      	}System.out.print("Enter the finishing year: ");
 		int endYear = scanner.nextInt();
      	while (endYear > 9999) {
         	System.out.println("Woah there Brody, they don't use Java in the year 10,000.\nTry again.");
       		endYear = scanner.nextInt();
      	}System.out.println("\nLeap years between " + startYear + " and " + endYear + ": ");
      	for (int i = startYear; i <= endYear; i++) {
         	if ((0 == i % 4 && 0 != i % 100) || (0 == i % 400)) {
            	System.out.println(i);
            	j++;
         	}
      	}if(j == 0) {
         	System.out.println("0");
      	}
   }
}