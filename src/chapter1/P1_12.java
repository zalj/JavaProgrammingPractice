package chapter1;

public class P1_12 {
	public static void main(String[] args) {
		final double KM_Per_MI = 1.6;
		int seconds = 60 * 60 + 40 * 60 + 35;
		double miPerSec = 24.0 / seconds;
		double miPerHour = miPerSec * 3600;
		double kmPerHour = KM_Per_MI * miPerHour;
		System.out.println(kmPerHour);
	}
}
