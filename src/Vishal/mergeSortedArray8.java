public class mergeSortedArray8 {
    static int[] mergeArrays(int[]arr1, int[]arr2)
    {
        int [] temp = new int[arr1.length + arr2.length];
        int m = arr1.length; 
        int n = arr2.length;
        int i = 0,j = 0;
        int k = 0;
        while(i < m && j < n)
        {
            if(arr1[i] <= arr2[j])
            {
                temp[k++] = arr1[i++];
            }
            else if(arr1[i] > arr2[j])
            {
                temp[k++] = arr2[j++];
            }
        }
        if(i < m)  temp[k++] = arr1[i++];
        if(j < n) temp[k++] = arr2[j++];
        return temp;
    }
    public static void main(String[] args) {
        int []arr1 = {1,3,5,7};
        int []arr2 = {2,4,6,8};

        int []res = mergeArrays(arr1, arr2);
        System.out.println("Sorted arrays");
        for(int i : res) {
            System.out.print(i + " ");
        }
        
    }
}
