package chapter2;

import java.util.Scanner;

public class P2_2 {
	public static void main(String[] args) {
		System.out.print("Enter the radius and length of a cylinder: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();
		System.out.println("The area is " + radius * radius * Math.PI * length);
	}
}
