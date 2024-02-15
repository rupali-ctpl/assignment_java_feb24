import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        int product = a * b;
        int finalSum = sum + product;
        int finalProduct = sum * product;
        System.out.println("Final Sum: " + finalSum);
        System.out.println("Final Product: " + finalProduct);
    }
}
