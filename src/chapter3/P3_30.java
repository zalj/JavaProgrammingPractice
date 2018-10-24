package chapter3;

import java.util.Scanner;

public class P3_30 {

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
    	long currentHours = (totalHours + offset) % 24;
    	
    	if(currentHours > 12)
			currentHours %= 12;
    	String timeInfo =  "Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds;
    	timeInfo += currentHours < 12 ? " AM" : " PM";
    	System.out.println(timeInfo);
	}

}
