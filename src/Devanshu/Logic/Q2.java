import java.util.Scanner;

public class Q2 {

    static int[] findSum(int[] arr,int n){
        int ans[]=new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    break;
                }
            }
        }
        
        if(ans[0]!=0)
            return ans;
        return arr;


    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]={1,3,5,7};

        int x[]=findSum(arr, n);

        for(int i:x) System.out.println(i);
        
        
        

        
    }
}
