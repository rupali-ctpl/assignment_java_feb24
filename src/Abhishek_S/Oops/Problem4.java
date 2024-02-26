// Class to represent a triangle.
class Triangle {
    int side1, side2, side3; 
    // Constructor to initialize the sides of the triangle.
    Triangle(int a, int b, int c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }
    // Calculate and display the area of the triangle.
    public void area() {
        System.out.println("Area is: " + (float) (side1 * side2) / 2);
    }
    // Calculate and display the perimeter of the triangle.
    public void perimeter() {
        System.out.println("Perimeter: " + (side1 + side2 + side3));
    }
}

// Main class
public class Problem4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.area();
        triangle.perimeter();
    }
}
