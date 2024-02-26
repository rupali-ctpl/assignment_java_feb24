class Parent {
    // Method to print parent value
    public String print() {
        return "This is parent class";
    }
}
    // child class inherits the properties from parent class
class child extends Parent {
    // Method to print cbhild value
    public String print1() {
        return "This is child class";
    }
}

public class Q9 {
    public static void main(String[] args) {
        // Creating object for parent class and child class
        Parent parentObj = new Parent();
        child childObj = new child();
        // Printing the result 
        System.out.println(parentObj.print());
        System.out.println(childObj.print1());
        System.out.println(childObj.print());

    }
}
