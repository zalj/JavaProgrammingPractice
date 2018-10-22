package chapter3;

public class P3_4 {

	public static void main(String[] args) {
		int randomMonth = (int)(Math.random() * 12);
		String[] months = {"January", "February", "March", "April", "May", "June",
							"July", "August", "September", "October", "November", "December"};
		System.out.println("Random month is " + months[randomMonth]);
	}
}
