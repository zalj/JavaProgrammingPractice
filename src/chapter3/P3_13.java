package chapter3;

import java.util.Scanner;

public class P3_13 {

	public static void main(String[] args) {

	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Prompt the user to enter filing status
	    System.out.print(
	      "(0-single filer, 1-married jointly or qualifying widow(er), "
	      + "\n2-married separately, 3-head of household)\n" +
	      "Enter the filing status: ");
	    int status = input.nextInt();

	    // Prompt the user to enter taxable income
	    System.out.print("Enter the taxable income: ");
	    double income = input.nextDouble();

	    // Compute tax
	    double tax = tax(income, status);

	    // Display the result
	    System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
	
	public static double tax(double income, int status) {
		int[] delim = new int[5];
		double tax = 0;
		if(status == 0) {
			delim[0] = 8350;  
			delim[1] = 33950;
			delim[2] = 82250; 
			delim[3] = 171550;
			delim[4] = 372950;
		}else if (status == 1) {
			delim[0] = 16700;  
			delim[1] = 67900;
			delim[2] = 137050; 
			delim[3] = 208850;
			delim[4] = 372950;
		}else if (status == 2) {
			delim[0] = 8350;  
			delim[1] = 33950;
			delim[2] = 68525; 
			delim[3] = 104425;
			delim[4] = 186475;
		}else if (status == 3) {
			delim[0] = 11950;  
			delim[1] = 45500;
			delim[2] = 117450; 
			delim[3] = 190200;
			delim[4] = 372950;
		}else {
			System.out.println("Error: Invalid status.");
			System.exit(1);
		}
		if (income <= delim[0])
	        tax = income * 0.10;
	      else if (income <= delim[1])
	        tax = delim[0] * 0.10 + (income - delim[0]) * 0.15;
	      else if (income <= delim[2])
	        tax = delim[0] * 0.10 + (delim[1] - delim[0]) * 0.15 +
	          (income - delim[1]) * 0.25;
	      else if (income <= delim[3])
	        tax = delim[0] * 0.10 + (delim[1] - delim[0]) * 0.15 +
	          (delim[2] - delim[1]) * 0.25 + (income - delim[2]) * 0.28;
	      else if (income <= delim[4])
	        tax = delim[0] * 0.10 + (delim[1] - delim[0]) * 0.15 +
	          (delim[2] - delim[1]) * 0.25 + (delim[3] - delim[2]) * 0.28 +
	          (income - delim[3]) * 0.33;
	      else
	        tax = delim[0] * 0.10 + (delim[1] - delim[0]) * 0.15 +
	          (delim[2] - delim[1]) * 0.25 + (delim[3] - delim[2]) * 0.28 +
	          (delim[4] - delim[3]) * 0.33 + (income - delim[4]) * 0.35;
		
		return tax;
	}
}
