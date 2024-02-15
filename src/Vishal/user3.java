import java.util.Scanner;

public class user3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = sc.nextLine();
        System.out.print("Enter your interest: ");
        String interest = sc.nextLine();
        System.out.print("Enter your rollno: ");
        int rollno  = sc.nextInt();
        
        System.out.println("Hey, my name is "+ username + " and my roll number is "+ rollno + ". My field of interest are "+ interest);
        sc.close();

    }
}
