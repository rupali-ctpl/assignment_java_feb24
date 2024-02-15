import java.util.Scanner;

public class CheckLowerUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a character : ");
        char ch=sc.next().charAt(0);

        if(ch>='a' && ch<='z') System.out.println("Lowercase character");
        else if(ch>='A' && ch<='Z') System.out.println("Uppercase character");
        else System.out.println("Enter a valid character");
    }
}
