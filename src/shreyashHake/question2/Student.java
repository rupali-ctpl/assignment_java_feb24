package shreyashHake.question2;

/** Question 2 */
public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student studentInstance = new Student("John", 2);

        System.out.printf("Student name is '%s' and his roll number is '%d'", studentInstance.name, studentInstance.rollNo);
    }
}
