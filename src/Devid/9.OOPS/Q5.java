class Rectangle {
    // Variables to store the length and breadth
    public int length;
    public int breadth;
    // Constructor with parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Method to calculate the area
    public int CalculateArea() {
        return length * breadth;
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Creating the two object of Rectangle class
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);
        // Printing the result
        System.out.println("Area of rectangle1 ==> " + rectangle1.CalculateArea() + " units");
        System.out.println("Area of rectangle2 ==> " + rectangle2.CalculateArea() + " units");
    }
}
