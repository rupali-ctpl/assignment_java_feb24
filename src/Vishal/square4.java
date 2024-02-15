import java.util.Scanner;

public class square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length & breadth ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        if(l == b) System.out.println("Square ");
        else System.out.println("Not a Square");
        sc.close(); 

    }
}
