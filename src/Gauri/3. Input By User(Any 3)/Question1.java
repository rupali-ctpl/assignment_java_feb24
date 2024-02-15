import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
