public class MergeSorting{
    public static void main(String[] args) {
        int[] arr = {80,30,20,50,90};
        int[] merged = merge(arr,0,arr.length-1);

        for(int i : merged){
            System.out.print(i+" ");
            if(s==e){
        }

    }
    public static int[] merge(int[] arr, int s, int e){
            int[] br = new int[1];
            br[0] = arr[s];
            return br;
          }

          int mid = (s+e)/2;
        
          int[] fh = merge(arr,s,mid);
          int[] lh = merge(arr,mid+1,e);

          int[] merged =  sort(fh,lh);
          return merged;
    }

    public static int[] sort(int[] one, int[] two){

        int[] sorted = new int[one.length+two.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<one.length && j<two.length){
            if(one[i]<two[j]){
                sorted[k] = one[i];
                k++;
                i++;
            }
            else{
                sorted[k]=two[j];
                j++;
                k++;
            }
        }
        if(i==one.length){
            while(j<two.length){
              sorted[k] = two[j];
              k++;
              j++;
            }
        }

        if(j==two.length){
            while(i<one.length){
                sorted[k] = one[i];
                i++;
                k++;
            }
           
        }
          return sorted;

    }
}