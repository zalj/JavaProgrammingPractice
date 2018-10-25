package chapter4;

import java.util.Scanner;

public class P4_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] latitudes = new double[4];
		double[] longitudes = new double[4];
		String[] cities = {"Atlanta", "Orlando", "Savannah", "Charlotte"};
		for(int i = 0; i < 4; i++) {
			System.out.print("Enter " + cities[i] + "'s latitude and longitude: ");
			latitudes[i] = input.nextDouble();
			longitudes[i] = input.nextDouble(); 
		}
		
	}
	
	public static double getDistance(double p1lati, double p1long, double p2lati, double p2long) {
		final double RADIUS_OF_EARTH = 6371.01;

		double x1 = Math.toRadians(p1lati);
		double y1 = Math.toRadians(p1long);
		double x2 = Math.toRadians(p2lati);
		double y2 = Math.toRadians(p2long);
		double distance = RADIUS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) + 
				Math.cos(x1) * Math.cos(x2) * (Math.cos(y1 - y2)));
		return distance;
	}
	
	public static double getTriangleArea(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double temp = s * (s - a) * (s - b) * (s - c);
		return Math.pow(temp, 0.5);
	}
}
