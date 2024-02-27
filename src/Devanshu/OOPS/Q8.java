// Class to represent a student.
class Student {
    String name;  
    // Default constructor
    Student() {
        name="Unknown";
    }
    // Parameterized constructor to set the name
    Student(String name) {
        this.name = name;
    }
}
// Main class 
public class Q8 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Devanshu");
        // Displaying the names
        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 2 Name: " + student2.name);
    }
}
