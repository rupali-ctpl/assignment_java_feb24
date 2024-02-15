import java.util.*;

public class sum_prod_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum1 = a+b;
        int prod1 = a*b;

        int sum2 = sum1+prod1;
        int prod2 = sum1*prod1;

        System.out.println("The sum of the result is "+sum2);
        System.out.println("The prod of the result is "+prod2);
    }
}
