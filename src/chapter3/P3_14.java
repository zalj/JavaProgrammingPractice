package chapter3;

import java.util.Scanner;

public class P3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Guess coins face(0: forward, 1: backward): ");
		int guess = input.nextInt();
		int random = (int)(Math.random() * 2);
		if(random == guess) {
			System.out.println("Right!");
		} else {
			System.out.println("False!");
		}
	}
}
