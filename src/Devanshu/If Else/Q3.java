import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        if(n>1000) System.out.println("Total cost is "+ ((n*100)-(n*100)/10));
        else System.out.println("Total cost is "+ (n*100));
    }
}
