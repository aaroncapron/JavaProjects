/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   CS 1101
   This code turns a numerical grade (integer) into a letter grade (A, B, C, D, F) using "if" and "else if" statements.
   Last modified: 2/1/2024
*/

import java.util.Scanner;
public class exConditions{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a grade in numerical format: ");
		int score = input.nextInt();
		System.out.println(" ");

		if(score>89 && score <101){
			System.out.println("A");
		}else if (score>79 && score<90){
			System.out.println("B");
		}else if (score>69 && score<80){
			System.out.println("C");
		}else if (score>59 && score<70){
			System.out.println("D");
		}else if (score>-1 && score<60){
			System.out.println("F");
		}else{
			System.out.println("Try again.");
		}
	}
}
