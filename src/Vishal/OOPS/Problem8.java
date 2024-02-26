/**
 * Class Student represent the Student details, having name && constructor to set name && method to display the name of the student.
 */
class Student{
    private String name;
    /**
     * Constructor with no perimeter i.e default constructor
     */
    Student(){
        name = "Unknown";
    }
    /**
     * Constructor with perimeter
     * @param na represents the name of the student.
     */
    Student(String na)
    {
        name = na;
    }
    /**
     * Prints the name of the student.
     */
    public void display(){
        System.out.println(name);
    }
}
public class Problem8 {
    public static void main(String[] args) {
        /**
         * Calling the default constructor without perimeter.
         */
        Student sc = new Student();
        sc.display();
        /**
         * Calling the constructor with perimeter.
         */
        Student sc1 = new Student("Adhi");
        sc1.display();
    }
}
