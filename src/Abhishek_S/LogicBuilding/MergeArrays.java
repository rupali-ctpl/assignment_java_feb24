
public class MergeArrays {
    public static int[] MergeTwoArrays(int[] arr1, int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;

        int resultArr[]=new int[len1+len2];

        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            if(arr1[i]<=arr2[j]){
                resultArr[k++]=arr1[i++];
            }
            else resultArr[k++]=arr2[j++];
        }
        while(i<len1) resultArr[k++]=arr1[i++];
        while(j<len2) resultArr[k++]=arr2[j++];

        return resultArr;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,10,11};

        int resultArr[]=MergeTwoArrays(arr1, arr2);

        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }
}
