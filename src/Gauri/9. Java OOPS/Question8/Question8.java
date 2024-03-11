// class to print the details of student
class Student {
    // declaring the name of the student - private data member
    private String name;
    // declaring the non-parameterized constructor
    // if name of student is not given, take the name as "Unknown"
    public Student() {
        this.name = "Unknown";
    }
    // declaring the parameterized constructor
    public Student(String name) {
        this.name = name;
    }
    // toString method, to return the details of the student- name
    public String toString() {
        return this.name;
    }
}

public class Question8 {
    public static void main(String[] args) {
        // instantiating the object of Student class
        // non-parameterized constructor
        Student s1 = new Student();
        // parameterized constructor
        Student s2 = new Student("Gauri");
        // printing details of students by using toString method
        System.out.println(s1);
        System.out.println(s2);
    }
}
