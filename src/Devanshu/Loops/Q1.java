import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int sum=0;
        int x;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=10;i++){
            x=sc.nextInt();
            sum+=x;
        }
        System.out.println("The Avg is " + sum/10f);
    }
}
