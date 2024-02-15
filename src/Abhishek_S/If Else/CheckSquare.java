import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1==num2){
            System.out.println("It is a square");
        }
        else System.out.println("Not a square");
    }
}
