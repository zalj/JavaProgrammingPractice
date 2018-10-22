package chapter2;

import java.util.Scanner;

public class P2_20 {
	public static void main(String[] args) {
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		double interest = balance * (interestRate / 1200);
		System.out.println("The interest is " + interest);
	}
}
