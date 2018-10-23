package chapter3;

import java.util.Scanner;

public class P3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first digits of an ISBN as integer: ");
		long ISBN9 = input.nextInt();
		long temp = ISBN9;
		int sum = 0;
		int i = 9;
		while(temp != 0) {
			sum += (temp % 10 * i);
			sum %= 11;
			i--;
			temp /= 10;
		}
		System.out.print("The ISBN-10 number is " + ISBN9);
		if(sum == 10)
			System.out.println("X");
		else 
			System.out.println(sum);
		
	}
}
