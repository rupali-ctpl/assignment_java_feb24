import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        if(a==b) System.out.println("Square");
        else System.out.println("Not square");
    }
}
