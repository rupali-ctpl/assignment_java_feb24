package Shrawani.Loops;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long avg=0, pro=1,cnt=0,sum=0;
        while(true){
            System.out.println("You want to exit? if yes enter 'Q' otherwise enter the number: ");
            String s= sc.next();
            Character c= s.charAt(0);
            if(c.equals('q')||c.equals('Q')){
                avg= sum/cnt;
                System.out.println("Average is: "+ avg);
                System.out.println("Product is: "+ pro);
                return;
            }
            else {

             int temp= sc.nextInt();
             sum+=temp;
             pro*=temp;

            }
            cnt++;


        }
    }
}
