package chapter3;

import java.util.Scanner;

public class P3_3 {

	public static void main(String[] args) {
		double a, b, c, d, e, f;
		System.out.print("Enter a, b, c, d, e, f: ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		double bottom = a * d - b * c;
		if(Math.abs(bottom) < 1E-7)
			System.out.println("The equation has no solution");
		else {
			double xTop = e * d - b * f;
			double yTop = a * f - e * c;
			double x = xTop / bottom;
			double y = yTop / bottom;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}

}
