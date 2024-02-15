import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length and breadth: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("It is square.");
        }else{
            System.out.println("No, It is not square");
        }
    }
}
