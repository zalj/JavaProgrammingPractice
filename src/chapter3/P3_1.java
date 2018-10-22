package chapter3;

import java.util.Scanner;

public class P3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		double judge = b * b - 4 * a * c;
		if(judge < 0) {
			System.out.println("The equation has no real roots");
		} else if (judge < 1e-7) {
			double r = -b / a / 2;
			System.out.printf("The equation has one root %.6f", r);
		} else {
			double r1 = (-b + Math.pow(judge, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(judge, 0.5)) / (2 * a);
			System.out.printf("The equation has two roots %.6f and %.6f",r1, r2);
		}
	}
}
