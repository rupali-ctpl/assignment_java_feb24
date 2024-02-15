package Shrawani.Input_by_user;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        int roll_number = sc.nextInt();
        System.out.println("You are interested in? (Separate with commas) ");
        sc.nextLine();
        String interest = sc.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + roll_number + ". My field of interest are " + interest+ ".");

    }
}
