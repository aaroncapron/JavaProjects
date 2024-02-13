// Author: Aaron Capron
// Instructor: TA Ali Nouri
// CS1101
// Lab 2 (OfficeHours)
// This code dispalys the office hours of TA and IAs on terminal using variables
// Sufficient practice using variables instead of typing
// NOTE: Names and hours were changed and flip numerous times for campus safety

class officeHours{
	public static void main(String[] args) {
		String nameTA = "Ali";
		System.out.println("Hi, my TA is " + nameTA + ".");
		String nameIA1 = "Ana";
		String nameIA2 = "Daniel A.";
		String nameIA3 = "Yara";
		
		System.out.println("My IAs are " + nameIA1 +", " + nameIA2 +", and " + nameIA3 +".");

		String officeHoursTA = "      MW from 1:30 - 3:30 PM\n\t\t\t           F from 9:00 - 10:00 AM";
		String officeHoursIA1 = "      TR from 12:00 - 2:30 PM";
		String officeHoursIA2 = "MW from 3:00 - 4:00 PM\n\t\t\t           TR from 10:30 AM - 12:00 PM";
		String officeHoursIA3 = "     TR from 1:30 - 3:30 PM\n\t\t\t           F from 10:00 - 11:00 AM (Virtual)";

		int courseNumber = 1101;
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
	}
}
