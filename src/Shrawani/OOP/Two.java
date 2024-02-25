package Shrawani.OOP;

import javax.xml.namespace.QName;

// Student class
class Student {
    private String name;
    private int roll_number;

    //Constructor
    public Student(String name, int roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }

    //Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_number);
    }
}

public class Two {
    public static void main(String[] args) {

        Student s = new Student("John", 2);

        // Calling the display method
        s.display();

    }
}
