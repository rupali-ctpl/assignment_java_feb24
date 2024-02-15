package Shrawani.Input_by_user;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two Integers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of Two numbers is: "+ (a+b));
        System.out.println("Product of entered numbers is: "+ (a*b));

    }
}
