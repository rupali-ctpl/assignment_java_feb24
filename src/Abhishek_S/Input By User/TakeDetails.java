import java.util.Scanner;

public class TakeDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int roll=sc.nextInt();
        sc.nextLine();
        String interest=sc.nextLine();

        System.out.println("hey, my name is "+name+" and my roll number is "+roll+". My field of interest are "+interest);
    }
}
