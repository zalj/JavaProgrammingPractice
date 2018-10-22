package chapter2;

import java.util.Scanner;

public class P2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		double accumulatedValue = investmentAmount * Math.pow((1 + interestRate / 12 / 100), years * 12);
		System.out.printf("Accumulated value is $%.2f", accumulatedValue);
	}
}
