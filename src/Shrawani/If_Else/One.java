package Shrawani.If_Else;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, b;
        System.out.println("Enter length of a rectangle: ");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        b = sc.nextDouble();
        if (l == b)
            System.out.println("It is a Square!");
        else System.out.println("It is a rectangle!");


    }
}
