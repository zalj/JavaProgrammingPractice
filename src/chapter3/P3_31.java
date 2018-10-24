package chapter3;

import java.util.Scanner;

public class P3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		
		double dollarToRMB = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		
		int select = input.nextInt();
		double amount;
		
		if(select == 0) {
			System.out.print("Enter the dollar amount: ");
			amount = input.nextDouble();
			System.out.println("$" + amount + " is " + amount * dollarToRMB + " yuan");
		}else if(select == 1) {
			System.out.print("Enter the RMB amount: ");
			amount = input.nextDouble();
			System.out.printf(amount + " yuan is $%.2f", amount / dollarToRMB);
		}else {
			System.out.print("Input Invalid!");
			System.exit(0);
		}
	}

}
