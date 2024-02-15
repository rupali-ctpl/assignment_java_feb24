import java.util.Scanner;

public class rectangle3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter length & breadth");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        int area = (int)(length * breadth) ;
        
        System.out.println("Area is " + area);


        sc.close();
    }
}
