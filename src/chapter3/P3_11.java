package chapter3;

import java.util.Scanner;

public class P3_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int years = input.nextInt();
		String[] months = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		System.out.print(months[month - 1] + " " + years + " has ");
		switch (month) {
		case 1:case 3:case 5:case 7:
		case 8:case 10:case 12: 
			System.out.print(31); 
			break;
		case 4:case 6:
		case 9:case 11: 
			System.out.print(30); 
			break;
		case 2:
			if(years % 400 == 0 || years % 4 == 0 && years % 100 != 0)
				System.out.print(29);
			else
				System.out.print(28);
			break;
		}
		System.out.print(" days");
	}
}
