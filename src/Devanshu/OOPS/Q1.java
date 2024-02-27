import java.util.Scanner;
// Class to represent the area of a rectangle.
class Area {
    private int length;
    private int breadth;
    // Set the dimensions of the rectangle.
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Calculate and return the area of the rectangle.
    public int getArea() {
        return length * breadth;
    }
}
// Main class
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        Area area = new Area();
        area.setDim(length, breadth);
        System.out.println("Area of rectangle is " + area.getArea());
    }
}
