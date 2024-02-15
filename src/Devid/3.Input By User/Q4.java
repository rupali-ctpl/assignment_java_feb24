import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, roll number, and field of interst respectively: ");
        String name = sc.nextLine();
        String rollNo = sc.nextLine();
        String foi = sc.nextLine();
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNo+". My Field of interst is "+foi+".");
    }
}
