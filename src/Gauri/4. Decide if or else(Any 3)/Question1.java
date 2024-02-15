import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Not square");
        }
    }
}
