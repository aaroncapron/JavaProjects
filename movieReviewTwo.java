/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   Course: CS 1101
   This program writes out a movie review that is partially user-input.
   ATTENTION: ALL USER INPUTS MUST NOT HAVE SPACES, USE CAMELCASE FORMAT!!!
   Last modified: 2/7/2024
*/

import java.util.Scanner;
class movieReviewTwo {
	public static void main(String[] args) {

		//All variables are defined here
		Scanner input = new Scanner (System.in);
		String movie = " ";
		String movieDirector = " ";
		int movieYear = 2017;
		float movieTickets = 57250000;
		char movieTier = 'S';
		float price = 1;
		boolean isExpensive = true;

		// Q1 - This piece of code allows user to input my favorite movie (Baby Driver) and it's director (Edgar Wright) using user-input variables.
		System.out.println("Enter your favorite movie: ");
		movie = input.next();
		System.out.println(" ");
		System.out.println("Enter the director of "+ movie +".");
		movieDirector = input.next();
		System.out.println(" ");
		System.out.println("My favorite movie is " + movie + " directed by " + movieDirector + ".");
		System.out.println(" ");

		// Q2 - This piece of code tells the movie's release year, how many tickets it sold, and my opinion on it's tier using variables.
		System.out.println("The movie was released in the year " + movieYear + ".");
		System.out.println("While in the box office, this movie sold " + movieTickets + " tickets.");
		System.out.println("Overall, this movie should be considered " + movieTier + " tier.");

		// Q3 - This piece of code allows user to enter the price of the movie to determine if expensive or not using boolean logic, < 20 = not, > 20 = expensive.
		System.out.println(" ");
		System.out.println("Enter the price of the movie (without the $): ");
		price = input.nextFloat();
		if (price > 20) {
			isExpensive = true;
			}
		if (price < 20) {
			isExpensive = false;
			}
		System.out.println(" ");
		System.out.println("Is the movie expensive? " + isExpensive);
		System.out.println(" ");
	}
}
