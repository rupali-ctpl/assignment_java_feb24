package Shrawani.Operators;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer n= sc.nextInt();
        String b= n.toString();
        for(int i=b.length()-1;i>=0;i--){
            System.out.print(b.charAt(i));
        }
        System.out.println();


    }
}
