package chapter3;

public class P3_24 {
	
	public static void main(String[] args) {
		String[] amounts = {"Ace", "2", "3", "4", "5",
							"6", "7", "8", "9", "10",
							"Jack", "Queen", "King"};
		String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		int amount = (int)(Math.random() * 13);
		int shape = (int)(Math.random() * 4);
		
		System.out.println("The card you picked is " + amounts[amount] + " of " + shapes[shape]);
	}
	
}
