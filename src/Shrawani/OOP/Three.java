package Shrawani.OOP;

class Triangle {
    // Lengths of triangle
    private double l1, l2, l3;

    // Set lengths
    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    // Method to calculate area
    void Area() {
        double s = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3)); // Heron's formula
        System.out.println("Area of the triangle is: " + area);
    }

    // Method to calculate perimeter
    void perimeter() {
        System.out.println("Perimeter of triangle is: " + (l1 + l2 + l3));
    }

}

// No user input
public class Three {
    public static void main(String[] args) {

        Triangle t = new Triangle();

        // Setting lengths
        t.setL1(3);
        t.setL2(4);
        t.setL3(5);

        // Calculating area and perimeter
        t.Area();
        t.perimeter();
    }
}
