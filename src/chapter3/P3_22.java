package chapter3;

import java.util.Scanner;

public class P3_22 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the point's coordinate: ");
		double x = input.nextDouble(), y = input.nextDouble();
		if(Math.pow(x * x + y * y, 0.5) < 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		}else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
		}
	}
	
}
