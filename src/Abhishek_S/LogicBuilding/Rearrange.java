
public class Rearrange {
    public static int[] reArrangeArray(int[] arr){
        int posNum=0 , n=arr.length;

        int resultArr[]=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]>0) posNum++;
        }
        int neg=0,pos=posNum;
        for(int i=0;i<n;i++){
            if(arr[i]<0) resultArr[neg++]=arr[i];
            else resultArr[pos++]=arr[i];
        }

        return resultArr;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,8,-5,1,-4};

        int resultArr[]=reArrangeArray(arr);

        for(var i:resultArr){
            System.out.print(i+" ");
        }
        
    }
}
