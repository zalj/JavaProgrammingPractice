package chapter2;

import java.util.Scanner;

public class P2_16 {
	public static void main(String[] args) {
		System.out.print("Enter the size: ");
		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();
		double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(length, 2);
		System.out.println("The area of the hexagon is " + area);
	}
}
