class Student {
    //declaring variable name and roll_number
    String name;
    int roll_no;
    //constructor of student
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    //method to display the details
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll_no);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        // creating object of class student with argument
        Student student = new Student("John", 2);
        student.display();
    }
}
