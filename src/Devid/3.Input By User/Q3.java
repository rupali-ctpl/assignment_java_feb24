import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
      
        double area = (int)(a*b);
      
        System.out.println("Area type casted to int is : "+ area);
        
    }
}
