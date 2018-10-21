package chapter1;

public class P1_10 {
	public static void main(String[] args) {
		double mPerSecond = 14.0 * 1000 / (45 * 60 + 30);
		double kmPerHour = mPerSecond * 3.6;
		double miPerHour = kmPerHour / 1.6;
		System.out.println(miPerHour);
	}
}
