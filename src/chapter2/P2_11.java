package chapter2;

import java.util.Scanner;

public class P2_11 {
	public static void main(String[] args) {
		System.out.print("Enter the number of years: ");
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();
		long currentPopulation = 312_032_486;
		int secondsPerYear = 60 * 60 * 24 * 365;
		int bornPerYear = (int)(secondsPerYear / 7.0);
		int deathPerYear = (int)(secondsPerYear / 13.0);
		int immigratePerYear = (int)(secondsPerYear / 45.0);
		int increase = bornPerYear + immigratePerYear - deathPerYear;
		for(int i = 0; i < years + 1; i++) {
			currentPopulation += increase;
		}
		System.out.println(currentPopulation);
	}
}
