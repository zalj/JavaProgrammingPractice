package chapter3;

import java.util.Scanner;

public class P3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three length of the triangle's three side: ");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		if(a + b > c && a + c > b && b + c > a) {
			double perimeter =  a + b + c;
			System.out.println("The perimeter of the triangle is " + perimeter);
		}else {
			System.out.println("Input invalid!");
		}
	}
	
}
