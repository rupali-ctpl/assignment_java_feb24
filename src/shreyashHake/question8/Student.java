package shreyashHake.question8;

public class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student instanceOne = new Student();
        System.out.println("Name of student is " + instanceOne.name);

        Student instanceTwo = new Student("Shreyash");
        System.out.println("\nName of student is " + instanceTwo.name);
    }
}
