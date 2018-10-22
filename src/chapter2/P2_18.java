package chapter2;

public class P2_18 {
	public static void main(String[] args) {
		System.out.printf("%-7s%-7s%-7s\n", "a", "b", "pow(a, b)");
		for(int a = 1; a <= 5; a++) {
			int b = a + 1;
			int pow = (int) Math.pow(a, b);
			System.out.printf("%-7s%-7s%-7s\n", a, b, pow);
		}
	}
}
