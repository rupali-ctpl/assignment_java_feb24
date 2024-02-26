class Student {
    // Varible to storing the name
    public String name;
    // Constructor with parameter
    public Student(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Creating the object for both the condition
        Student student1 = new Student("Akash");
        Student student2 = new Student("");
        // Printing the value
        System.out.println("Student 1 name is "+student1.name);
        System.out.println("Student 2 name is "+student2.name);
    }
}
