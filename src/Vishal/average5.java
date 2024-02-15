import java.util.Scanner;

public class average5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 10 numbers ");
        double sum = 0;
        for(int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("average is " +(sum / 10));
        sc.close();
    }
}
