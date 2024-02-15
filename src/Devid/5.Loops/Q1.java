import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int avg=0;
        System.out.println("Enter the 10 value: ");
        for(int i = 1; i<=10; i++){
            System.out.println("Enter the "+i+ " value: ");
            int a = sc.nextInt();
            sum = sum + a;
            avg = sum/10;
        }
        
        System.out.println(avg);
    }
}
