package chapter3;

import java.util.Scanner;

public class P3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble(), price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble(), price2 = input.nextDouble();
		
		double factor1 = price1 / weight1, factor2 = price2 / weight2;
		if(Math.abs(factor1 - factor2) < 1e-7)
			System.out.println("Two package have the same price.");
		else {
			System.out.print("Package ");
			if(factor1 < factor2)
				System.out.print(1);
			else
				System.out.print(2);
			System.out.println(" has a better price.");
		}
	}

}
