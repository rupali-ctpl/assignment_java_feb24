package Shrawani.OOP;

import java.util.Scanner;

class Rectangle {
    //Dimensions
    private double length;
    private double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Calculate area
    public double Area() {
        return (length * breadth);
    }

}

public class Five {
    public static void main(String[] args) {

        // Instances
        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(5, 8);

        System.out.println("Area of rectangle A is: " + a.Area());
        System.out.println("The area of rectangle B is: " + b.Area());
    }
}
