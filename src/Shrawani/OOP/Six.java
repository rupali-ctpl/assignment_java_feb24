package Shrawani.OOP;

import java.util.Scanner;

class Area1 {
    private double length;
    private double breadth;

    Area1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return (length * breadth);
    }
}

public class Six {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        double l= sc.nextInt();
        System.out.println("Enter the breadth: ");
        double b= sc.nextInt();
        Area1 a= new Area1(l,b);
        System.out.println("The area of rectangle is "+ a.returnArea());
    }
}
