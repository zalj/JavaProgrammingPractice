package chapter3;

import java.util.Scanner;

public class P3_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1 and p2: ");
		double x0 = input.nextDouble(), y0 = input.nextDouble(),
				x1 = input.nextDouble(), y1 = input.nextDouble(),
				x2 = input.nextDouble(), y2 = input.nextDouble();
		double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		System.out.print("(" + x2 + ", " + y2 + ") is on the ");
		if(Math.abs(status) < 1e-6) {
			// Do nothing
		}else if (status > 0) {
			System.out.print("left side of the ");
		}else if (status < 0) {
			System.out.print("right side of the ");
		}
		System.out.println("line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")"); 
	}

}
