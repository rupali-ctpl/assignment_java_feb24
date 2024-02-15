package Shrawani.OOP;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Triangle {
    private double l1, l2, l3;

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    void Area() {
        double s = getL1() + getL2() + getL3();
        System.out.println("Area of the triangle is: " + (s * (s - l1) * (s - l2) * (s - l3)));
    }

    void perimeter() {
        System.out.println("Perimeter of triangle is: " + (getL1() + getL2() + getL3()));
    }
//    Triangle(int l1, int l2, int l3) {
//        this.l1=l1;
//        this.l2= l2;
//        this.l3=l3;
//    }


}

public class Three {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        t.setL1(sc.nextDouble());
        t.setL2(sc.nextDouble());
        t.setL3(sc.nextDouble());
        t.Area();
        t.perimeter();
    }
}
