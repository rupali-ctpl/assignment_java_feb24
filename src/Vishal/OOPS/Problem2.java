/**
 * Class Student having Constructor Student to initialize the name & rollNo of the students
 */
class Student{
    /**
     * given variables represent the name & rollNo of the student respectively.
     */
    private String name;
    private int roll_no;
    /**
     * Setting the name & rollNo of the student
     */
    Student(String n, int r){
        name = n;
        roll_no = r;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        /**
         * Creating student object and passing name & roll_no as parameters to the Student constructor.
         */
        Student stu = new Student("John",2);
    }
}
