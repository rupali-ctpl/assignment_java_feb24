import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        sc.close();
        double area = length * breadth;
        int finalArea = (int) area;
        System.out.println("Area: " + finalArea);
    }
}
