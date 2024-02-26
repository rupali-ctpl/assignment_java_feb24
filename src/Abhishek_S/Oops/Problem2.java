// Class to represent a student.
class Student {
    private String name;      
    private int roll_no;     
    // Set the name of the student.
    public void setName(String name) {
        this.name = name;
    }
    // Set the roll number of the student.
    public void setRollNo(int no) {
        this.roll_no = no;
    }
}
// Main class
public class Problem2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setRollNo(2);
    }
}
