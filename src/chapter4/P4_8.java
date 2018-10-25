package chapter4;

import java.util.Scanner;

public class P4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		char ch = (char)input.nextInt();
		System.out.println("The character for ASCII code " + (int)ch + " is " + ch);
	}

}
