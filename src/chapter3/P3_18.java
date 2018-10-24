package chapter3;

import java.util.Scanner;

public class P3_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of package: ");
		double weight = input.nextDouble();
		
		double c = 0;
		
		if(weight > 20) {
			System.out.println("The package cannot be shipped");
			System.exit(0);
		}
		else if (weight > 10) 
			c = 10.5;
		else if (weight > 3) 
			c = 8.5;
		else if (weight > 1) 
			c = 5.5;
		else
			c = 3.5;
		System.out.println("The c(w) is " + c);
		
	}

}
