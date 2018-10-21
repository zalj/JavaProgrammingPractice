package chapter1;

public class P1_7 {
	public static void main(String[] args) {
		double pi = 4d;
		double factor1 = 0;
		double factor2 = factor1;
		for(int i = 1; i <= 11; i += 2) {
			if(i % 4 == 1)
				factor1 += 1.0 / i;
			if(i % 4 == 3)
				factor1 -= 1.0 / i;
		}
		for(int i = 1; i <= 13; i += 2) {
			if(i % 4 == 1)
				factor2 += 1.0 / i;
			if(i % 4 == 3)
				factor2 -= 1.0 / i;
		}
		System.out.println(pi * factor1);
		System.out.println(pi * factor2);
	}
	
}
