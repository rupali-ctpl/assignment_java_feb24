import java.util.*;

public class findsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the number whoese sum you want");
        int num = sc.nextInt();
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the index "+i+ " element");
            arr[i] =sc.nextInt();
        }
       int[] ans = findSum(arr,num);
       System.out.println("Result is as follows");
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
       }
    }
    static int[] findSum(int[] arr,int n){
        if(arr.length<=2){
            return arr;
        }
        else{
            int prev =arr[0];
            int[] ans = new int[2];
            for(int i=1;i<arr.length;i++){
                int curr = arr[i];
                if((curr+prev)==n){
                   ans[0]=prev;
                   ans[1] =curr;
                   return ans;
                }
                prev = arr[i];
            }
            return arr;
        }
    }
}
