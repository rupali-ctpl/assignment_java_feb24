import java.util.*;

public class Question4 {
    static void reArrange(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        reArrange(arr);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
