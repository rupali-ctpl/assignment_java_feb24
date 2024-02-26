class Triangle {
    // Variables to store the sides of triangle
    public int side1;
    public int side2;
    public int side3;
    // Constructor without parameters
    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    // Method to calculate perimeter
    public double CalculatePerimeter() {
        return (side1 + side2 + side3);
    }
    // Method to calculate area
    public double CalculateArea() {
        double s = CalculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        // Printing the result
        System.out.println("Area is " + obj.CalculateArea() + " units");
        System.out.println("Perimeter is " + obj.CalculatePerimeter() + " units");
    }
}
