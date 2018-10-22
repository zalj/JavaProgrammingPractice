package chapter2;

import java.util.Scanner;

public class P2_4 {
	public static void main(String[] args) {
		System.out.print("Enter a number in pounds: ");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
