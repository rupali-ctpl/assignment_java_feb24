
public class FindMin {
    public static int findMinElement(int[] arr){
        int len=arr.length;
        int minElement = Integer.MAX_VALUE;

        for(int i=0;i<len;i++){
            if(arr[i]<minElement) arr[i]=minElement;
        }

        return minElement;
    }
    public static void main(String[] args) {
        int arr[]={33,54,17,8,10,45,23,34,7,4452,9};

        int minElement=findMinElement(arr);

        System.out.println("Smallest in array is : "+minElement);
    }
}
