import java.util.Scanner;

public class revrseArray6 {
    public static void main(String[] args) {
        int []a = new int[10];
        Scanner sc = new Scanner(System.in);
        int []b = new int[10];
        for(int i  = 0; i < 10 ; i++) {
            int x = sc.nextInt();
            a[i] = x;
            b[9-i] = x;
        }
        System.out.println("Array A ");
        for(int i : a)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array B ");
        for(int i : b)
        {
            System.out.print(i + " ");
        }
        sc.close();

    }
}
