package Shrawani.OOP;

import java.util.Scanner;

class Area1 {
    // Dimensions
    private double length;
    private double breadth;

    //Constructor
    Area1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //Area
    public double returnArea() {
        return (length * breadth);
    }
}

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Length Input
        System.out.println("Enter the length: ");
        double l = sc.nextInt();

        // Breadth Input
        System.out.println("Enter the breadth: ");
        double b = sc.nextInt();

        //Instance
        Area1 a = new Area1(l, b);

        // Displaying area of rectangle
        System.out.println("The area of rectangle is " + a.returnArea());
    }
}
