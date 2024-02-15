import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a+" is greater than "+b);
        }
    }
}
