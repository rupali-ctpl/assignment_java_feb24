import java.util.*;

public class merge_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array");
        int m = sc.nextInt();
        System.out.println("Enter the length of the second array");
        int n = sc.nextInt();
        
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int[] ans = new int[m+n];


        System.out.println("Enter the first array elements");
        for(int i=0;i<m;i++){
            System.out.println("Enter index "+i +" element");
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the second array elements");
        for(int i=0;i<n;i++){
            System.out.println("Enter index "+i +" element");
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            ans[k] =arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k] =arr2[j];
            j++;
            k++;
        }

        System.out.println("The new sorted array is as follows");
        for(int c=0;c<ans.length;c++){
            System.out.print(ans[c]+" ");
        }
    }
}
