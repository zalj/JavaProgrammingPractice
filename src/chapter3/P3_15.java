package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class P3_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a lottery number(three-digit): ");
		int guess = input.nextInt();
		int[] guessi = {guess / 100, guess / 10 % 10, guess % 10};
		int lottery = (int)(Math.random() * 900 + 100);
		int[] lotteryi = {lottery / 100, lottery / 10 % 10, lottery % 10};
		Arrays.sort(guessi);
		Arrays.sort(lotteryi);
		if(guess == lottery) {
			System.out.println("You win 10000$!");
		}else if (guessi[0] == lotteryi[0] && guessi[1] == lotteryi[1] && guessi[2] == lotteryi[2]) {
			System.out.println("You win 3000$!");
		}else {
			System.out.println("You don't win.");
		}
	}
}
