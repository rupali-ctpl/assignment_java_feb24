// class to print name and roll number of a student
class Student {
    // declaring data members
    public String name;
    public int roll_no;
}

public class Question2 {
    public static void main(String[] args) {
        // instantiating the object of Student class
        Student s1 = new Student();
        // setting the name and roll number of the student object
        s1.name = "John";
        s1.roll_no = 2;
        // printing the name and roll number of the student
        System.out.println("Name: " + s1.name + "\nRoll no: " + s1.roll_no);
    }
}
