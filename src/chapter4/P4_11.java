package chapter4;

import java.util.Scanner;

public class P4_11 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter: ");
			String token = input.nextLine();
			if(token.equals("EOF"))
				break;
			System.out.print(token + " is ");
			if(!isNumeric(token))
				System.out.print("not ");
			System.out.println("a numberic.");
		}
	}
	
	static class Person{
		private int id;
		private String name;
		public Person(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getId() {
			return this.id;
		}
		
		public Person() {
			
		}
	}
	static class Student extends Person{
		private int grade;
		
		public Student(int grade) {
			this.grade = grade;
		}
	}

	public static boolean isNumeric(String token) {
		token = token.trim();
		if(token.equals(""))
			return false;
		if(token.matches("[0-9]*[.]?[0-9]*"))
			return true;
		return false;
	}
}

class Circle{
	double radius;
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			return this.radius == ((Circle)o).radius;
		}else {
			return this == o;
		}
	}
}