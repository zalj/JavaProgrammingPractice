package chapter3;

import java.util.Scanner;

public class P3_8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
