import java.util.*;

public class casting_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of length and breadth of rectangle ");
        double len = sc.nextDouble();
        double br = sc.nextDouble();

        int area =(int)(len*br);
        System.out.println("The area of rectangle typcased into int is "+area);
    }
}
