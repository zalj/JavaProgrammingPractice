package chapter4;

import java.util.Scanner;

public class P4_2 {

	final static double RADIUS_OF_EARTH = 6371.01;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Latitude:  - PI / 2 <= latitude <= PI / 2, positive represent north");
		System.out.println("Longitude: - PI <= longitude <= PI , positive represent west");
		System.out.print("Enter point1 (latitude and longitude) in degress: ");
		double p1lati = input.nextDouble(), p1long = input.nextDouble();
		System.out.print("Enter point2 (latitude and longitude) in degress: ");
		double p2lati = input.nextDouble(), p2long = input.nextDouble();
		double x1 = Math.toRadians(p1lati);
		double y1 = Math.toRadians(p1long);
		double x2 = Math.toRadians(p2lati);
		double y2 = Math.toRadians(p2long);
		double distance = RADIUS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) + 
				Math.cos(x1) * Math.cos(x2) * (Math.cos(y1 - y2)));
		System.out.println("The distance between two points is " + distance + " km");
	}

}
