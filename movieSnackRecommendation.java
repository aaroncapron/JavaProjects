/*
	Author: Aaron Capron
	Course: CS 1101
 	Instructor: TA Ali Nouri
 	This code asks user questions to determine a movie snack recommendations using boolean logic and integer values. Then, the code asks user to leave a review to respond with using integers.
 	Last Modified: 2/1/2024
*/

import java.util.Scanner;

	class movieSnackRecommendation {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			//This code lays out variables to be used later.
			double pricePoint = 1;
			boolean isInterested = true;
			boolean preferPopcorn = true;
			int numPeople = 1;
			int rating = 1;

			// Q1
			//This code asks user questions with variables 'boolean isInterested', 'boolean preferPopcorn', and 'int numPeople' to help recommend a movie snack.
			System.out.println("How much money are you willing to spend on movie snacks?: ");
			pricePoint = input.nextDouble();
			System.out.println(" ");
			System.out.println("I would be interested in trying a slushy! (type true or false): ");
			isInterested = input.nextBoolean();
			System.out.println(" ");
			System.out.println("I would prefer popcorn over candy (type true or false): ");
			preferPopcorn = input.nextBoolean();
			System.out.println(" ");
			System.out.println("How many people are you buying snacks for?: ");
			numPeople = input.nextInt();
			System.out.println(" ");
		
			/* 
				Q2
				TODO: implement logic using conditionals (nested if-else statements) based on the following logic tree:
				NOTE: Your program should use the variables defined above and output exactly ONE RECOMMENDATION
		
		 								<pricePoint>
		 						      /           \
		                      <10.00 /             \ >=10.00
		                            /               \
		               <isInterested>              <preferPopcorn>
		                  /      \                     /         \
		            true /        \ false        true /           \ false
		                /          \                 /             \
		          STRAWBERRY      SODA       LARGE POPCORN          <numPeople>
		           SLUSHY                                              /    \
		                                                            1 /      \ >1
		                                                             /        \
		                                                          COOKIE    NERDS 
		                                                          DOUGH     GUMMY
		                                                          BITES     CLUSTERS
			*/
			//This code prints a movie snack recommendation based on user-input answers to previous questions.
			System.out.print("Recommendation: ");
				if (pricePoint<10) {
					if (isInterested == true) {
						System.out.print("Strawberry Slushy");
					}
					else if (isInterested == false) {
						System.out.print("Soda");
					}
				}
				if (pricePoint>=10) {
					if (preferPopcorn == true) {
							System.out.print("Large Popcorn");
						}
					else if (preferPopcorn == false) {
						if (numPeople == 1) {
							System.out.print("Cookie Dough Bites");
							}
							if(numPeople > 1) {
								System.out.print("Nerds Gummy Clusters");
							}
						}
					}

			// Q3
			//This code asks the user for a rating and responds on the 'int rating' variable using "if statements".
			System.out.println("\n\nOn a scale from 1-10, how satisfied are you with your recommendation? (enter a positive integer): ");
				rating = input.nextInt();
			if ((rating < 1) || (rating > 10)) {
				System.out.println("Invalid input. Goodbye!");
			}
			if (rating > 6) {
				System.out.println("\nThank you for your feedback! Here is the code for a 50% discount on your next movie ticket: KFH34J5J ");
			}
			if (rating <= 6) {
				System.out.println("\nThank you for your feedback! Here is the code for a free movie ticket: JFH34J5J ");
			}
	}
}