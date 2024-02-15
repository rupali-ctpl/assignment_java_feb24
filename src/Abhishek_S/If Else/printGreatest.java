import java.util.Scanner;

public class printGreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2) System.out.println("num1 is greater : "+num1);
        else if(num2>num1) System.out.println("num2 is greater : "+num2);
        else System.out.println("Both are equal");
    }
}
