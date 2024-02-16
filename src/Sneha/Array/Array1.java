import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] copy = new int[10];

        System.out.println("Enter 10 elements: ");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=copy.length-1;i>=0;i--){
            copy[i] = a[i];
            System.out.print(copy[i]);
        }
       sc.close();
    }
}
