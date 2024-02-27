// Class to represent a rectangle.
class Rectangle {
    int length, breadth;  
    // Constructor to initialize the dimensions of the rectangle.
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Calculate and return the area of the rectangle.
    public int Area() {
        return length * breadth;
    }
}
// Main class 
public class Q5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        // Area of the first rectangle
        System.out.println("Area of the first rectangle is: " + rectangle1.Area());
        // Area of the second rectangle
        System.out.println("Area of the second rectangle is: " + rectangle2.Area());
    }
}
