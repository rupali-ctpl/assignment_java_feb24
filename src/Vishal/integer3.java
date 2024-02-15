import java.util.Scanner;

public class integer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum is " + (x+y));
        System.out.println("Product is " + (x* y));
        sc.close();
    }
}
