import java.util.*;

public class Question5 {
    void rotateArray(int[] arr) {
        int length = arr.length;
        int temp = arr[length - 1];
        for (int i = length - 1; i > 0; i--) 
            arr[i] = arr[i - 1];
        arr[0] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        Question5 q = new Question5();
        q.rotateArray(arr);
        for (int x : arr) 
            System.out.print(x + " ");        
    }
}
