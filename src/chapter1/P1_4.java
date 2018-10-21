package chapter1;

public class P1_4 {
	public static void main(String[] args) {
		System.out.printf("%-5s%-5s%-5s", "a", "a^2", "a^3");
		for(int i = 1; i <= 4; i++) {
			System.out.println();
			System.out.printf("%-5s%-5s%-5s", i, i * i, i * i * i);
		}
	}
}
