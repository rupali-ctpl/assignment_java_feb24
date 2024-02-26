// Parent class with a display method
class Parent {
    public void display() {
        System.out.println("This is parent class");
    }
}
// Child class extending Parent and overriding the display method
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is child class");
    }
}
// Main class 
public class Problem9 {
    public static void main(String[] args) {
        // Method of the parent class and object of the parent class
        Parent parent1 = new Parent();
        parent1.display();
        // Method of the child class and object of the child class
        Child child = new Child();
        child.display();
        // Method of the parent class and object of the child class
        Parent parent2 = new Child();
        parent2.display();
    }
}
