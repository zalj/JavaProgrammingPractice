package chapter3;

import java.util.Scanner;

public class P3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digits integer: ");
		int num = input.nextInt();
		if(num % 10 == num / 100)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}
}
