import java.util.Scanner;
// Class to represent the area of a rectangle.
class RectangleArea {
    int length, breadth;  
    // Constructor to initialize the dimensions of the rectangle.
    RectangleArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Calculate and return the area of the rectangle.
    public int area() {
        return length * breadth;
    }
}
// Main class
public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking input from user
        System.out.print("Enter length: ");
        int length = scan.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = scan.nextInt();
        RectangleArea rectangle= new RectangleArea(length, breadth);
        //printing the arean 
        System.out.println("Area of rectangle is: " + rectangle.area());
    }
}
