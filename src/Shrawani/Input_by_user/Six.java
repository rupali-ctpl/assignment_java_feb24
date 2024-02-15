package Shrawani.Input_by_user;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b&& b==c){
            System.out.println("All three are equal.");
        }else{
            if(a==b||b==c||a==c){
                System.out.println("Any two of them are equal.");
            }
            else{
                System.out.println("All unequal");
            }
        }


    }
}
