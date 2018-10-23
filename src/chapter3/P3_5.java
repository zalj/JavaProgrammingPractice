package chapter3;

import java.util.Scanner;

public class P3_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
		
		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		
		System.out.println("Today is " + days[day] + " and the future day is " + days[(day + elapsedDays) % 7]);
	}
}
