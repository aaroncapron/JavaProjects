/* Author: Aaron Capron
   Personal Project
   This program asks a "teacher" to input grades as positive integers
   Once teacher inputs a negative integer, the program averages all inputs
   This average is then converted to it's appropriate grade letter format
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class gradeAverage{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
     	 int totalGrades = 0;
     	 int gradeCount = 0;
     	 System.out.println("Enter grades (negative to calculate average and letter grade):");
        
     	 while (true) {
       		int grade = scanner.nextInt();  
         	if (grade < 0) {
            break;
         	}totalGrades += grade;
         	gradeCount++;
      	}if (gradeCount == 0) {
         System.out.println("No grades entered.");
      	}else {
         	double average = (double) totalGrades / gradeCount;
         	System.out.println("Average Grade: " + average);            
         	char letterGrade;
         	if (average >= 90 && average <= 100) {
           		letterGrade = 'A';
        	 } else if (average >= 80) {
           		letterGrade = 'B';
         	} else if (average >= 70) {
          		letterGrade = 'C';
         	} else if (average >= 60) {
         		letterGrade = 'D';
         	} else {
         		letterGrade = 'F';
         	}System.out.println("Letter Grade: " + letterGrade);
      }scanner.close();
   }
}