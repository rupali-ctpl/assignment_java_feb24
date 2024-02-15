import java.util.Scanner;

public class CheckThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("All are equal");
        }
        else if(num1==num2 || num2==num3 || num1==num3){
            System.out.println("Any two are equal");
        }
        else System.out.println("All are different");

    }
}
