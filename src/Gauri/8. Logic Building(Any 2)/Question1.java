import java.util.*;

public class Question1 {
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m + n];
        for (int i = 0; i < m; i++)
            arr[i] = arr1[i];
        for (int i = 0; i < n; i++)
            arr[m+i] = arr2[i];
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++)
            arr1[i] = sc.nextInt();

        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();
        sc.close();
        int[] arr = mergeArrays(arr1, arr2);
        for(int x: arr)
            System.out.println(x);
    }
}
