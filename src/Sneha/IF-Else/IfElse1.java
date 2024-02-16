import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length: ");
        int l = sc.nextInt();

        System.out.println("enter breadth: ");
        int b = sc.nextInt();

        if(l==b){
            System.out.println("It's Square");
        }
        else{
            System.out.println("It's Not a Square.");
        }
    }
}
