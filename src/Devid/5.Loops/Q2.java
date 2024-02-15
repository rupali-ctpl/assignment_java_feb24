import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String p ;
        while (p != "q") {
            Scanner sc = new Scanner(System.in);
            int inputs = sc.nextInt();
            System.out.println("Press q for quit: ");
             p = sc.next();
        }
    }
}
