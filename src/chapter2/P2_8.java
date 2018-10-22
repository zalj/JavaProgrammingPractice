package chapter2;

import java.util.Scanner;

public class P2_8 {

	public static void main(String[] args) {
		System.out.print("Enter the time zone offset to GNT: ");
		Scanner input = new Scanner(System.in);
		int offset = input.nextInt();
		long totalMillSeconds = System.currentTimeMillis();
    	long totalSeconds = totalMillSeconds / 1000;
    	long currentSeconds = totalSeconds % 60;
    	long totalMinutes = totalSeconds / 60;
    	long currentMinutes = totalMinutes % 60;
    	long totalHours = totalMinutes / 60;
    	long currentHours = totalHours % 24;
    	String timeInfo =  "Current time is " + (currentHours + offset) % 24 + ":" + currentMinutes + ":" + currentSeconds;
    	System.out.println(timeInfo);
	}
}
