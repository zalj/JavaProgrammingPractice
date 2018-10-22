package chapter2;

import java.util.Scanner;

public class P2_12 {
	public static void main(String[] args) {
		System.out.print("Enter speed and acceleration: ");
		Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double minRunwayLength = Math.pow(speed, 2) / 2 / acceleration;
		System.out.printf("The minimum runway length for this airplane is %.3f", minRunwayLength);
	}
}
