import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // System.out.println("Greatest number: " + (a > b ? a : b));
        if (a > b) {
            System.out.println("Greatest number: " + a);
        } else {
            System.out.println("Greatest number: " + b);
        }
    }
}
