package chapter3;

import java.util.Scanner;

public class P3_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] select = {"scissor", "rock", "paper"};
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userSelect = input.nextInt();
		int computerSelect = (int)(Math.random() * 3);
		
		System.out.print("The computer is " + select[computerSelect] + ". ");
		System.out.print("You are " + select[userSelect] + "");
		
		if(userSelect == computerSelect) {
			System.out.println(" too. It is a draw" );
		}else if(userSelect == computerSelect + 1 || userSelect == computerSelect - 2) {
			System.out.println(". You won");
		}else {
			System.out.println(". You lose");
		}
	}
}
