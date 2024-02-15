import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int b[]=new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){
            int x=sc.nextInt();
            a[i]=x;
        }

        for(int i=0;i<10;i++){
            b[i]=a[9-i];
        }

        for(int i:b) System.out.print(i+" ");
    }
}
