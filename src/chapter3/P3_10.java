package chapter3;

import java.util.Scanner;

public class P3_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		System.out.print(a + " + " + b + " = ");
		int c = input.nextInt();
		if(c == a + b)
			System.out.println(true);
		else 
			System.out.println(false);
		
	}
}
