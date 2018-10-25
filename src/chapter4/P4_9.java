package chapter4;

import java.util.Scanner;

public class P4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.nextLine().charAt(0);
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}

}
