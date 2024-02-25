package Shrawani.OOP;

class Student1 {
    private String name;

    //Default constructor
    Student1() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    Student1(String name) {
        this.name = name;
    }

    // Method to display
    void display() {
        System.out.println(name);
    }
}

public class
Eight {
    public static void main(String[] args) {

        //Instances
        Student1 s = new Student1();
        Student1 s2 = new Student1("Shravni");

        //Display
        s.display();
        s2.display();
    }
}
