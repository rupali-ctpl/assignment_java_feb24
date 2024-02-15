import java.util.*;

public class min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        

        for(int i=0;i<n;i++){
            System.out.println("Enter the index "+i+" element");
            arr[i]= sc.nextInt();
             
        }
        int min = findMinimum(arr,n);
        System.out.println("The minimum element of the array is "+min);
    }
    static int findMinimum(int[] arr,int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
        }
          return min;
    }
}
