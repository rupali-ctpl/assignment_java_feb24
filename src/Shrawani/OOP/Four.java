package Shrawani.OOP;

import java.util.Scanner;

class Triangle1 {
    private double l1, l2, l3; //Lengths

    //Constructor
    Triangle1(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    //Method to calculate area
    void Area() {
        double s = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3)); // Heron's formula
        System.out.println("Area of the triangle is: " + area);
    }

    //Method to calculate perimeter
    void perimeter() {
        System.out.println("Perimeter of triangle is: " + (l1 + l2 + l3));
    }
}

public class Four {
    public static void main(String[] args) {

        // Class instance
        Triangle1 t = new Triangle1(3, 4, 5);

        // calling methods
        t.Area();
        t.perimeter();
    }
}
