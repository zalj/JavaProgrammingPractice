package chapter2;

import java.util.Scanner;

public class P2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double intialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		double Q = kilograms * (finalTemperature - intialTemperature) * 4184;
		System.out.println("The energy needed is " + Q);
	}
}
