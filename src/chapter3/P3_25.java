package chapter3;

import java.util.Scanner;

public class P3_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.err.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble(), y1 = input.nextDouble();
		double x2 = input.nextDouble(), y2 = input.nextDouble();
		double x3 = input.nextDouble(), y3 = input.nextDouble();
		double x4 = input.nextDouble(), y4 = input.nextDouble();
		
		double a = y1 - y2, b = x2 - x1, e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4, d = x4 - x3, f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		crammer(a, b, c, d, e, f);
	}
	
	/**
	 * ax + by = e
	 * cx + dy = f
	 * 
	 * x = (ed - bf) / (ad - bc)
	 * y = (af - ec) / (ad - bc)
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 */
	public static void crammer(double a, double b, double c, double d, double e, double f) {
		double bottom = a * d - b * c;
		if(Math.abs(bottom) < 1E-7) {
			System.out.println("The two lines are parellel");
			System.exit(0);
		}
		else {
			double xTop = e * d - b * f;
			double yTop = a * f - e * c;
			double x = xTop / bottom;
			double y = yTop / bottom;
			System.out.printf("The intersecting point is at (%.5f, %.5f)", x, y);
		}
	}
}
