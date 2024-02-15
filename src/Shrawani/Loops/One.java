package Shrawani.Loops;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         double sum= 0;
        System.out.println("Enter 10 numbers: ");
         for(int i=0;i<10;i++){
             double temp= sc.nextInt();
             sum+=temp;
         }

        System.out.println("Average is: "+ (sum/10));
    }
}
