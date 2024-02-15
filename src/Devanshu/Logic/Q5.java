

public class Q5 {
    static void rotateArray(int[] arr){
        int n=arr.length;
        int x=arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;

    }
    public static void main(String[] args) {
        int arr[]={1,3,-2,4,12,-8};
        rotateArray(arr);

        for(int i:arr) System.out.print(i+" ");
    }
}
