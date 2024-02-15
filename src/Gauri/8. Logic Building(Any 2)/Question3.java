import java.util.*;

public class Question3 {
    static int findMinimum(int[] arr) {
        int minimum = arr[0];
        for (int x : arr) {
            if (x < minimum)
                minimum = x;
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println("Minimum element: "+findMinimum(arr));
    }
}
