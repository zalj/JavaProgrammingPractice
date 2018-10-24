package chapter3;

import java.util.Scanner;

public class P3_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x, y coordinates, and radius: ");
		double c1x = input.nextDouble(), c1y = input.nextDouble(), c1radix = input.nextDouble();
		System.out.print("Enter circle2's center x, y coordinates, and radius: ");
		double c2x = input.nextDouble(), c2y = input.nextDouble(), c2radix = input.nextDouble();
		
		double centerDistance = Math.pow((c1x - c2x) * (c1x - c2x) + (c1y - c2y) * (c1y - c2y), 0.5);
		
		if(centerDistance <= Math.abs(c1radix - c2radix)) {
			System.out.println("circle2 is indise circle1");
		} else if (centerDistance <= c1radix + c2radix) {
			System.out.println("circle2 is overlaps circle1");
		} else {
			System.out.println("circle2 does not overlap circle1");
		}
	}

}
