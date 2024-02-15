package shreyashHake.question6;

import shreyashHake.question5.Rectangle;

import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return  length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle : ");
        int breadth = sc.nextInt();

        Area instance = new Area(length, breadth);
        System.out.println("Area of rectangle for given values : " + instance.returnArea());
    }
}
