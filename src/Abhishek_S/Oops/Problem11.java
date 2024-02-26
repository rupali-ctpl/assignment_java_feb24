// Shape class with a display method
class Shape {
    public void display() {
        System.out.println("This is shape class");
    }
}
// Rectangle class extending Shape and overriding the display method
class Rectangle extends Shape {
    @Override
    public void display() {
        System.out.println("This is rectangular class");
    }
}
// Circle class extending Shape and overriding the display method
class Circle extends Shape {
    @Override
    public void display() {
        System.out.println("This is circular class");
    }
}
// Main class 
public class Problem11 {
    public static void main(String[] args) {
        // Creating instances of Shape, Rectangle, and Circle
        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        // Displaying the messages using polymorphism
        shape.display();
        rectangle.display();
        circle.display();
    }
}
