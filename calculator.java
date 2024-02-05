/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   CS 1101
   This code is a Java-powered calculator, complete with addition, subtraction, multiplication, and division.
*/

import java.util.Scanner;

class calculator{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		//Console asks user to input numbers and choose and operation.
		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = input.nextDouble();
		System.out.println("Choose an operation: +, -, *, /");
		char operation = input.next().charAt(0);

		double result;
		//This code does the work.
		switch (operation) {
			case '+' :
				result = num1 + num2;
				System.out.println("Result: " + num1 + "+" + num2 + "=" + result);
				break;
			case '-' :
				result = num1 - num2;
				System.out.println("Result: " + num1 + "-" + num2 + "=" + result);
				break;
			case '*' :
				result = num1 * num2;
				System.out.println("Result: " + num1 + "*" + num2 + "=" + result);
				break;
			case '/' :
				if (num2 == 0) {
					System.out.println("Error: Division by zero is not possible.");
				}else {
				result = num1 / num2;
				System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
				}
			break;
			default:
				System.out.println("Invalid character. Try Again.");
		}
		System.out.println("Thank you for using this calculator.");
		input.close();
	}
}