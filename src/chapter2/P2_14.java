package chapter2;

import java.util.Scanner;

public class P2_14 {
	public static void main(String[] args) {
		final double KILOGRAM_PER_POUND = 0.45359237;
		final double METERS_PER_INCHES = 0.0254;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		double kilograms = pounds * KILOGRAM_PER_POUND;
		double meters = inches * METERS_PER_INCHES;
		double BMI = kilograms / Math.pow(meters, 2);
		System.out.println("BMI is " + BMI);
		input.close();
	}
}
