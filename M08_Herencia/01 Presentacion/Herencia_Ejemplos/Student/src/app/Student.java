package app;

public class Student extends Person{

    private int studentNumber;

    public Student(){
        super();
        studentNumber = 0;
    }

    public Student(String initialName, int initialStudentNumber){
      super.setName(initialName);
      this.studentNumber = initialStudentNumber;  
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void writeOutput(){
        System.out.println("Name: "+ super.getName());
        System.out.println("Student Number:" + this.studentNumber);
    }
    
    public boolean equals(Student otherStudent){
        return this.hasSameName(otherStudent) && 
            (this.studentNumber == otherStudent.studentNumber);
    }
}