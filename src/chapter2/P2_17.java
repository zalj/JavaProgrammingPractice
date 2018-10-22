package chapter2;

import java.util.Scanner;

public class P2_17 {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit between -58�H and 41�H: ");
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		double twc = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + twc);
	}
}
