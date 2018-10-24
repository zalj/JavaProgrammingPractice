package chapter3;

import java.util.Scanner;

public class P3_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: (1-12): ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: (1-31): ");
		int day = input.nextInt();
		
		int q = day; 
		int m = (month == 1 || month == 2) ? month + 12 : month;
		year = (month == 1 || month == 2) ? year - 1 : year;
		int j = year / 100;
		int k = year % 100;
		
		int h = q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j;
		h %= 7;
		
		System.out.println("Day of the week is " + weekdays[h]);
	}

}
