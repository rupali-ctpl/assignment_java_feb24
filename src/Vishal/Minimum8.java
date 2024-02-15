import java.util.Scanner;

public class Minimum8 {
    static int findMinimum(int []arr)
    {
        int mini = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array ");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the numbers ");
        for(int i =0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = findMinimum(arr);
        System.out.println("Minimum element is " + ans);
        sc.close();
    }
}
