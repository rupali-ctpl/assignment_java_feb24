class Student {
    // Variables to store the student values
    public String name;
    public int roll_no;
}

public class Q2 {
    public static void main(String[] args) {
        Student obj = new Student();
        // Assigning the values to object
        obj.name = "John";
        obj.roll_no = 2;
        // Displaying student information
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
    }
}
