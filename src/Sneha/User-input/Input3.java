import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number: ");
    int a = sc.nextInt();

    System.out.println("enter second number: ");
    int b = sc.nextInt();

    System.out.println("enter third number: ");
    int c = sc.nextInt();

    if(a==b && b==c){
        System.out.println("All the numbers are equal.");
    }

    if(a==b || b==c || a==c){
        System.out.println("Not All numbers are equal but some of them.");
    }

    sc.close();
    
    }
}
