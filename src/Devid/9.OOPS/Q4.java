class Triangle {
    // Variables to store the sides of triangle
    public int side1;
    public int side2;
    public int side3;
    // Constructor with parameters
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

public class Q4 {
    public static void main(String[] args) {
        Triangle obj = new Triangle(3, 4, 5);
        // Printing the result
        System.out.println("Area is " + obj.CalculateArea() + " units");
        System.out.println("Perimeter is " + obj.CalculatePerimeter() + " units");
    }
}
