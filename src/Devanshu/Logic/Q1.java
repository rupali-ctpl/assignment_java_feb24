import java.util.Scanner;

public class Q1 {
    static int[] merge(int[] arr1,int[]arr2){
        int ans[]=new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) ans[k++]=arr1[i++];
            else ans[k++]=arr2[j++];
        }
        while(i<arr1.length) ans[k++]=arr1[i++];

        while(j<arr2.length) ans[k++]=arr2[j++];

        

        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr1[]=new int[4];
        int arr2[]=new int[4];

        arr1[0]=1;
        arr1[1]=3;
        arr1[2]=5;
        arr1[3]=7;

        arr2[0]=2;
        arr2[1]=4;
        arr2[2]=6;
        arr2[3]=8;

        int ans[]=merge(arr1, arr2);
        for(int i:ans) System.out.println(i+" ");
    }
}
