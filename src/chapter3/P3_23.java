package chapter3;

import java.util.Scanner;

public class P3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Point (" + x + ", " + y + ") is ");
		if(x <= -5 || x >= 5 || y <= -5.0 / 2 || y >= 5.0 / 2)
			System.out.print("not ");
		System.out.println("in the rectangle");
	}

}
