// Class to represent a student.
class Student {
    String name = "Unknown";  // Default name is set to "Unknown"
    // Default constructor
    Student() {
    }
    // Parameterized constructor to set the name
    Student(String name) {
        this.name = name;
    }
}
// Main class 
public class Problem8 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Abhishek");
        // Displaying the names
        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 2 Name: " + student2.name);
    }
}
