package chapter2;

import java.util.Scanner;

public class P2_13 {
	public static void main(String[] args) {
		System.out.print("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double amountPerMonth = input.nextDouble();
		int months = 6;
		double balance = 0;
		double rate = 5.0 / 100 / 12;
		for(int i = 0; i < months; i++) 
			balance = (balance + amountPerMonth) * (1 + rate);
		System.out.println("After sixth month, the account value is $" + balance);
	}
}
