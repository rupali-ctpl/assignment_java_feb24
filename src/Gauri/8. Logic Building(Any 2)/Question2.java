import java.util.*;

public class Question2 {
    static int[] findSum(int[] arr, int n) {
        int[] array = new int[2];
        int sum = n;
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if ((arr[i] + arr[j]) < sum) {
                i++;
            } else if ((arr[i] + arr[j]) > sum) {
                j--;
            } else {
                array[0] = arr[i];
                array[1] = arr[j];
                return array;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = sc.nextInt();
        sc.close();

        int arr2[] = new int[2];
        arr = findSum(arr, sum);
        
        System.out.println(arr2[0]+" "+arr2[1]);

    }
}
