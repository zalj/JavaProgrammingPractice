package chapter2;

import java.util.Scanner;

public class P2_6 {
	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number = input.nextInt();
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("The sum of the digits is " + sum);
	}
}
