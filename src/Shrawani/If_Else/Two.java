package Shrawani.If_Else;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two Integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) System.out.println(a + " is greater.");
        else System.out.println(b + " is greater.");
    }
}
