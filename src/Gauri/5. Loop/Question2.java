import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'q';
        int x;
        double sum = 0, count = 0, product = 1;
        while ((x = sc.nextInt()) != (int) c) {
            sum += x;
            product *= x;
            count++;
            System.out.println("Press q to quit");
        }
        // System.out.println((byte)c);
        System.out.println("Average: " + sum/count);
        sc.close();
    }
}
