package src;

public class StudentDemo {
	public static void main(String[] args) {
		//studentCount begins at 0
		Student s1 = new Student("Juan", 2356687);   //studentCount = 1
		Student s2 = new Student("Martha", 2356688); //studentCount = 2
		Student s3 = new Student("Ana", 2356675);	 //studentCount = 3
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());		
	}  	
}
