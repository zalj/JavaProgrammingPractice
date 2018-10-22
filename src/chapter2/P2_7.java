package chapter2;

import java.util.Scanner;

public class P2_7 {
	public static void main(String[] args) {
		System.out.print("Enter a number of minutes: ");
		Scanner input = new Scanner(System.in);
		long minutes = input.nextLong();
		long hours = minutes / 60;
		long remainMinutes = minutes % 60;
		long days = hours / 24;
		long remainHours = hours % 24;
		long years = days / 365;
		long remainDays = days % 365;
		System.out.println(minutes + " minutes is " + years + " years and " + remainDays + " days and " + 
				remainHours + " hours and " + remainMinutes + " minutes.");
	}
}
