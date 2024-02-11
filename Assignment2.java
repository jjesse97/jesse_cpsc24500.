/*Joseph Jesse
 * Object Oriented Programming
 * 2/11/2024
 * Calculate the tax on the inputed income
 */

import java.util.Scanner;
import java.math.RoundingMode;

public class Assignment2 {
	
	//Calculate the amount of tax owed
	public static double taxCalc(double x) {
		double tax = 0;
		
		if (x <= 4000) {
			tax = 0;
		}
		else if (x <= 5500 ){
			tax = (int) ((x-4000)*.1);
		}
		else if (x <= 29500) {
			tax = (int) ((1500)*.1 + (x-5500)*.2);

		}else if (x > 29500) {
			tax = (int) ((1500)*.1 + (28000)*.2 + (x-33500)*.4);

		}
		return tax;
	}

	public static void main(String[] args) {
		
		//Declare Variables
		Scanner scan = new Scanner(System.in);
		String name;
		double income;
		
		//Input name
		System.out.print("Enter Name: ");
		name = scan.nextLine();
		System.out.print("");
		
		//Input income and round if necessary
		System.out.print("Enter Income: ");
		income = scan.nextDouble();
		income=Math.round(income);
		System.out.println("");
		
		//Determine if input is invalid
		while(income < 0) {
			System.out.println("Invalid input, income should be zero or more");
			System.out.println("");
			System.out.print("Enter Income: ");
			income = scan.nextDouble();
			System.out.println("");
		}
		
		System.out.println("Name: " + name);
		System.out.println("Income: J$" + income);
		System.out.println("Income Tax: J$" + taxCalc(income));

	}

}
