/* Author: Aaron Capron
   Personal Projet
   This code computes the approximate the value of π given the user-input variable
   Last Updated: 2/12/2024
*/
import java.util.Scanner;
public class piApprox{
	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
     	int n = scanner.nextInt();
    	double piApprox = 4;
   	int temp = 1;
  	double sum = 0.0;
	
	for (int i = 0; i < n; i++) {
        	if (i % 2 == 0) {
            		sum = sum + (double) 1 / temp;
       		}else{
            		sum = sum - (double) 1 / temp;
         	}temp = temp + 2;
      }sum = sum * 4;
      piApprox = (double) sum;
      System.out.println("piApprox = " + piApprox);
   }
}
