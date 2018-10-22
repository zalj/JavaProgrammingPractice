package chapter2;

import java.util.Scanner;

public class P2_19 {
	public static void main(String[] args) {
		System.out.print("Enter 3 points for triangle: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble(), y1 = input.nextDouble();
		double x2 = input.nextDouble(), y2 = input.nextDouble();
		double x3 = input.nextDouble(), y3 = input.nextDouble();
		double l1 = getDistance(x3, y3, x2, y2);
		double l2 = getDistance(x1, y1, x3, y3);
		double l3 = getDistance(x1, y1, x2, y2);
		double s = (l1 + l2 + l3) / 2;
		double area = s * (s - l1) * (s - l2) * (s - l3);
		area = Math.pow(area, 0.5);
		System.out.println("The area of triangle is " + area);
	}
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
	}
}
