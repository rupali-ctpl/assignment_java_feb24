package Shrawani.OOP;

import java.util.Scanner;

class Triangle1{
    private double l1, l2, l3;
        Triangle1(double l1, double l2, double l3) {
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
        }

    void Area() {
        double s = l1+l2+l3;
        s/=2;
        System.out.println("Area of the triangle is: " + (s * (s - l1) * (s - l2) * (s - l3)));
    }

    void perimeter() {
        System.out.println("Perimeter of triangle is: " + (l1 + l2 + l3));
    }
}
public class Four{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        double l1,l2,l3;
        l1= sc.nextDouble();
        l2=sc.nextDouble();
        l3= sc.nextDouble();

        Triangle1 t = new Triangle1(l1,l2,l3);

        t.Area();
        t.perimeter();
    }
}
