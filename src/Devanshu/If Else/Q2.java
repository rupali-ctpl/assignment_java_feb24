import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        if(a>b) System.out.println("Greatest is " + a );
        else if(b>a) System.out.println("Greatest is " + b );
        else System.out.println("both are equals");
    }
}
