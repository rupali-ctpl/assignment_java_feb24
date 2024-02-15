package Shrawani.OOP;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public double Area() {
        return (getLength() * getBreadth());
    }

}

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(5, 8);

        System.out.println("Area of rectangle A is: " + a.Area());
        System.out.println("The area of rectangle B is: " + b.Area());
    }
}
