import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        sc.close();
        int cost = quantity * 100;
        int discount = 0;
        if (cost > 1000) {
            discount = cost/10;
        }
        int finalCost = cost - discount;
        System.out.println(finalCost);
    }
}
