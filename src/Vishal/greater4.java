import java.util.Scanner;

public class greater4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) System.out.println("A is greater " + a);
        else if ( a < b ) System.out.println("B is greater " + b);
        else System.out.println("Both are equal ");
        sc.close(); 
    }
}
