package chapter2;

import java.util.Scanner;

public class P2_5 {
	public static void main(String[] args) {
		System.out.print("Enter the subtotal and a gratuity rate: ");
		Scanner input = new Scanner(System.in);
		double subTotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subTotal * gratuityRate / 100;
		double total = subTotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
