import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("enter first value: ");
        int a = sc.nextInt();

        System.out.println("enter second value: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("The greater value is: "+a);
        }
        else{
            System.out.println("The greater value is: "+b);
        }
    }
}
