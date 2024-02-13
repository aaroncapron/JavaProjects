/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   CS 1101
   This code reads temperature values from a .csv file and uses them for various calculations
   Finds the average, highest, lowest, and all values over 25 degrees from temperatures.csv
   Last Updated: 2/7/2024
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class temperatureAnalysis {
	public static void main (String [] args) throws FileNotFoundException {
	//Computing average temperature using while and for statements with a variable.
	try {
		Scanner input = new Scanner(new File("temperatures.csv"));
     		double current = 0;
      		while (input.hasNextLine()) {
         		for (int i = 0; i < 30; i++) {
         			current += input.nextInt();
         		}
      		}
      		double avg = current / 30;
     		 System.out.println("Average Temperature: " + avg + "\u00B0 C");
     		 input.close();
   	}catch (Exception e) {
     		System.out.println("An error has occured while reading the file.\nPlease notify your system administrator.");
	//Computing maximum value from .csv file using while and if statements with two variables to compare.
  	}try {
      		Scanner input = new Scanner(new File("temperatures.csv"));
      		double current;
      		double max = 0;
      		while (input.hasNextDouble()) {
         		current = input.nextDouble();
         		if (current > max) {
          	  	max = current;
         		}
      		}System.out.println("Highest Temperature: " + max + "\u00B0 C");
      		input.close();
   	}catch (Exception e) {
      		System.out.println("An error has occured while reading the file.\nPlease notify your system administrator.");
	//Computing minimum value from .csv file using while and if statements two variables to compare.
   	}try {
      		Scanner input = new Scanner(new File("temperatures.csv"));
      		double current;
      		double min = 30;
      		while (input.hasNextDouble()) {
         		current = input.nextDouble();
         		if (current < min) {
            			min = current;
         		}
      		}System.out.println("Lowest Temperature: " + min + "\u00B0 C");
      		input.close();
   	}catch (Exception e) {
      		System.out.println("An error has occured while reading the file.\nPlease notify your system administrator.");
	//Computing .csv values that are above 25 using while and if statements and two variables.
   	}try {
   		Scanner input = new Scanner(new File("temperatures.csv"));
      		double current;
      		int above25 = 0;
      		while (input.hasNextDouble()) {
      			current = input.nextDouble();
      			if (current > 25) {
      				above25++;
      			}
	      	}System.out.println("Days above 25.0\u00B0 C: " + above25 + " Days");
      		input.close();
        }catch (Exception e) {
      		System.out.println("An error has occured while reading the file.\nPlease notify your system administrator.");
        }
    }
}
