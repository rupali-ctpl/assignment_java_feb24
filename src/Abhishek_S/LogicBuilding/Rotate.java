
public class Rotate {
    public static int[] rotateArray(int[] arr){
         int n=arr.length;
         int resultArr[]=new int[n];

         int lastEle=arr[n-1];
         for(int i=0;i<n-1;i++){
            resultArr[i+1]=arr[i];
         }
           
         resultArr[0]=lastEle;
         
         return resultArr;

    }
    public static void main(String[] args) {
        int arr[]={-1,2,8,-5,1,-4};

        int resultArr[]=rotateArray(arr);
        for(var i:resultArr){
            System.out.print(i+" ");
        }
    }
}
