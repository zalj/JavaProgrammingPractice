package chapter4;

import java.util.Scanner;

public class P4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertec: ");
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %.2f", area);
	}
}
