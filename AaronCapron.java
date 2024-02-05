//Author: Aaron Capron
//CS1101
//Lab 2
// This code dispalys the office hours of TA and IAs on terminal using variables.

class AaronCapron{
	public static void main(String[] args) {
		//DO NOT forget to change the class name and file name to your name.
		String nameTA = "Ali";  // TODO: Change to your TA name.
		System.out.println("Hi, my TA is " + nameTA + ".");

		// TODO: intialize String variables to store the name of IAs.
		//Please use proper names for your variables.
		String nameIA1 = "Ana";
		String nameIA2 = "Daniel A.";
		String nameIA3 = "Yara";
		
		//TODO: print the IAs name.
		System.out.println("My IAs are " + nameIA1 +", " + nameIA2 +", and " + nameIA3 +".");

		String officeHoursTA = "      MW from 1:30 - 3:30 PM\n\t\t\t           F from 9:00 - 10:00 AM";
		//TODO declare String variables to store the office hours of IAs.
		//Please use proper names for your variables.
		String officeHoursIA1 = "      TR from 12:00 - 2:30 PM";
		String officeHoursIA2 = "MW from 3:00 - 4:00 PM\n\t\t\t           TR from 10:30 AM - 12:00 PM";
		String officeHoursIA3 = "     TR from 1:30 - 3:30 PM\n\t\t\t           F from 10:00 - 11:00 AM (Virtual)";

		int courseNumber = 1101; //TODO: change to your course number
		System.out.println();
		System.out.println("Welcome to " + "CS" + courseNumber + ".");
		System.out.println();
		System.out.println("\t" + nameTA + " office hours is: " + officeHoursTA + ".");
		System.out.println();
		System.out.println("\t" + nameIA1 + " office hours is: " + officeHoursIA1 + ".");
		System.out.println();
		System.out.println("\t" + nameIA2 + " office hours is: " + officeHoursIA2 + ".");
		System.out.println();
		System.out.println("\t" + nameIA3 + " office hours is: " + officeHoursIA3 + ".");
		//TODO: print all TA and IAS office hours using variables you decalre above.
		// please using \t to format the output.
		
		
		//Please submit your modified code on gradescope under section LAB2
	}
}