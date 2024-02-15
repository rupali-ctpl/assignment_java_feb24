package Shrawani.DataType;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int a= sc.nextInt();
        System.out.println("Integer: "+ a);

        System.out.println("Enter a Decimal value: ");
        double d= sc.nextDouble();
        System.out.println("Double: "+ d);

        sc.nextLine();
        System.out.println("Enter a Character: ");
        String s= sc.nextLine();
        char c= s.charAt(0);
        System.out.println("Character: "+c);


    }
}
