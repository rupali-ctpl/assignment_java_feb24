import java.util.HashSet;

public class FindSum {
    public static int[] FindTwoNumbers(int[] arr,int n){
        int len1=arr.length;
        int resultArr[]=new int[2];
 
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<len1;i++){
           if(st.contains(n-arr[i])){
               resultArr[0]=n-arr[i];
               resultArr[1]=arr[i];
               return resultArr;
           }
           else st.add(arr[i]);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,8};
        int n=4;

        int resultArr[]=FindTwoNumbers(arr,n);

        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }
}
