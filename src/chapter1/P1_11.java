package chapter1;

public class P1_11 {
	public static void main(String[] args) {
		long currentPopulation = 312_032_486;	// Use underline in large number
		int secondsPerYear = 60 * 60 * 24 * 365;
		int bornPerYear = (int)(secondsPerYear / 7.0);
		int deathPerYear = (int)(secondsPerYear / 13.0);
		int immigratePerYear = (int)(secondsPerYear / 45.0);
		int increase = bornPerYear + immigratePerYear - deathPerYear;
		for(int i = 0; i < 5; i++) {
			currentPopulation += increase;
			System.out.println(currentPopulation);
		}
	}
}
