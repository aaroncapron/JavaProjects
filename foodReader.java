/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   CS 1101
   This code reads text from a file using the scanner and prints it.
   Last modified: 1/31/2024
*/

//Imported libraries to make stuff work!
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class foodReader {

public static void main (String [] args) {
	//Creates a file reader to pull data from
	//Creates a scanner to read the data into Java
	try {
		File newObj = new File ("food_file.txt");
		Scanner input = new Scanner (newObj);
`		//Goes line by line to pull data separately, first by String, then by Double. 
		while (input.hasNextLine()) {
			System.out.println(input.next());
			System.out.println(input.nextDouble() - 2); // Subtracts 2 from all prices listed in the .txt file
		}input.close(); //Closes the scanner to be polite :)
	}catch (Exception e) {
		System.out.println("An error has occured while reading the file.\nLet your administrator know."); 
		//If the file cannot be found, this "catches" the error message to tell the user to tell their administrator/more-experienced individual to fix it.
		}
	}
}
