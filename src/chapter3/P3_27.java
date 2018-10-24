package chapter3;

import java.util.Scanner;

public class P3_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x and y coordinates: ");
		double x = input.nextDouble(), y = input.nextDouble();
		boolean inTriangle = false;
		if(x > 0 && x < 200 && y > 0 && y < 100 && 2 * y + x < 200)
			inTriangle = true;
		System.out.print("The point is ");
		if(!inTriangle)
			System.out.print("not ");
		System.out.println("in the triangle");
	}

}
