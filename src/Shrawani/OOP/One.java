package Shrawani.OOP;

import java.util.Scanner;

class Area {
    //Dimensions
    private int length;
    private int breadth;

    //Method to set dimensions
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //Method to calculate area
    public int getArea() {
        return (length * breadth);
    }

}

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instance of class
        Area a = new Area();
        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();

        // Set dimensions
        a.setDim(l, b);

        // Calculate area
        int area = a.getArea();
        System.out.println("The area of rectangle is " + area);
    }
}
