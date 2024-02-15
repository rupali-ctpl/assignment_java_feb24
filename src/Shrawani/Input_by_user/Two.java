package Shrawani.Input_by_user;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int res1=(a+b);
        int res2= (a*b);
        System.out.println("Sum of Two numbers is: "+ res1);
        System.out.println("Product of entered numbers is: "+ res2);
        System.out.println("Sum of results is: "+ (res1+res2));
        System.out.println("Product of two results: "+ (res1*res2));



    }
}
