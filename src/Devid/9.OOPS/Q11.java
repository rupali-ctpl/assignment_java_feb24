class Shape {
    // Method to print " This is shapes."
    public void print() {
        System.out.println("This is shape");
    }
}
    // class Rectangle extending the properties of Shapes class
class Rectangle extends Shape {
    // Method to print " This is rectangular shapes "
    public void print() {
        System.out.println("This is rectangular shape");
    }
}
    // class Circle extending the properties of Shapes class
class Circle extends Shape {
    // Method to print " This is circular shapes "
    public void print() {
        System.out.println("This is Circular shape");
    }
}

public class Q11 {
    public static void main(String[] args) {
        // Creating the object for rectangle and circle
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        // Printing the result
        rectangle.print();
        circle.print();
    }
}
