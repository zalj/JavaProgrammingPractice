package chapter4;


public class P4_11 {
	
	public static void main(String[] args) {
		Object object = new Student(1, "James");
		System.out.println(object.getClass());
		Student o = (Student)object;
		System.out.println(o.getId());
	}
	static class Student{
		private int id;
		private String name;
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getId() {
			return this.id;
		}
	}
}
