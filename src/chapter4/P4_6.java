package chapter4;

public class P4_6 {

	public static void main(String[] args) {
		double[] alpha = new double[3];
		
		int radius = 40;
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = Math.random() * Math.PI * 2; 
		}
		
		double[] x = new double[3];
		double[] y = new double[3];
		for(int i = 0; i < 3; i++) {
			x[i] = radius * Math.cos(alpha[i]); 
			y[i] = radius * Math.sin(alpha[i]); 
		}
		
		double[] radians = new double[3];
	}

}
