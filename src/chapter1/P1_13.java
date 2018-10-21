package chapter1;

public class P1_13 {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		a = 3.4; b = 50.2; e = 44.5;
		c = 2.1; d = 0.55; f = 5.9;
		double bottom = a * d - b * c;
		if(Math.abs(bottom) < 1E-6)
			System.out.println("No answer");
		else {
			double xTop = e * d - b * f;
			double yTop = a * f - e * c;
			double x = xTop / bottom;
			double y = yTop / bottom;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
