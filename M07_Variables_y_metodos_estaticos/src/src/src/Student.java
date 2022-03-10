package src;

public class Student {
	//Instance variable, every student has its own name
	private String name;
	//Instance variable, every student has a different studentID
	private long studentID;
	//Static variable, studentCount is shared between all instances
	private static int studentCount;
	
	public Student(String name, long studentID) {
		this.name = name;
		this.studentID = studentID;
		Student.studentCount++;
		System.out.println(this.name + " has enrolled. We are now " + Student.studentCount +" students in total!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	
	
	
}
