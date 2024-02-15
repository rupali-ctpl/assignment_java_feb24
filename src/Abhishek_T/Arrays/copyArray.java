import java.util.*;

public class copyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 array elements ");
        int[] arr = new int[10];
        int[] copy = new int[10];

        for(int i=0;i<10;i++){
            System.out.println("Enter the index "+i+" element -");
            arr[i] = sc.nextInt();
        }

        for(int i=9;i>=0;i--){
            copy[i]=arr[10-i-1];
        }

        System.out.println("The array elements in the reverse order are as follows");
        for(int i=0;i<10;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
