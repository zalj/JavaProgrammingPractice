package chapter4;

import java.util.Scanner;

public class P4_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double area = n * side * side / 4 / Math.tan(Math.PI / n);
		System.out.println("The area of the polygon is " + area);
	}

}
