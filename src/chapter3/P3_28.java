package chapter3;

import java.util.Scanner;

public class P3_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input r1's info
		System.out.print("Enter r1's center x, y coordinates, width, and height: ");
		double r1CenterX = input.nextDouble(), r1CenterY = input.nextDouble(), 
				r1Width = input.nextDouble(), r1Height = input.nextDouble();
		
		// Input r2's info
		System.out.print("Enter r2's center x, y coordinates, width, and height: ");
		double r2CenterX = input.nextDouble(), r2CenterY = input.nextDouble(), 
				r2Width = input.nextDouble(), r2Height = input.nextDouble();
		
		double r1Left = r1CenterX - r1Width / 2, r1Right = r1CenterX + r1CenterX / 2,
				r1Top = r1CenterY + r1Height / 2, r1Bottom = r1CenterY - r1Height / 2;
		double r2Left = r2CenterX - r2Width / 2, r2Right = r2CenterX + r2CenterX / 2,
				r2Top = r2CenterY + r2Height / 2, r2Bottom = r2CenterY - r2Height / 2;
		
		if (r2Bottom > r1Top || r2Top < r2Bottom || r2Left > r1Right || r2Right < r1Left) {
			System.out.println("r2 does not overlap r1");
		}else if (r2Bottom >= r1Bottom && r2Top <= r1Top && r2Left >= r1Left && r2Right <= r1Right) {
			System.out.println("r2 is inside r1");
		}else {
			System.out.println("r2 overlaps r1");
		}
	}
	
}
