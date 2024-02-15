package Shrawani.If_Else;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100 to check grade:");
        int m = sc.nextInt();

        if (m > 80 && m <= 100)
            System.out.println("A");
        else if (m > 60 && m <= 80)
            System.out.println("B");
        else if (m > 50 && m <= 60)
            System.out.println("C");
        else if (m > 45 && m <= 50)
            System.out.println("D");
        else if (m > 25 && m <= 45)
            System.out.println("E");
        else if (m >= 0 && m <= 25)
            System.out.println("F");
        else System.out.println("Invalid!");
    }
}
