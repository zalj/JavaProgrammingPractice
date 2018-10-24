package chapter3;

import java.util.Scanner;

public class P3_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1 and p2: ");
		double x0 = input.nextDouble(), y0 = input.nextDouble(),
				x1 = input.nextDouble(), y1 = input.nextDouble(),
				x2 = input.nextDouble(), y2 = input.nextDouble();
		double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		boolean inRange = (x2 >= x0 && x2 <= x1) || (x2 <= x0 && x2 >= x1);
		System.out.print("(" + x2 + ", " + y2 + ") is ");
		if(Math.abs(status) > 1e-6 || !inRange) 
			System.out.print("not ");
		
		System.out.println("on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}

}
