

public class Q4 {
    static int[] reArrange(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,-2,4,12,-8,0};
        int ans[]=reArrange(arr);

        for(int i:ans) System.out.print(i+" ");
    }
}
