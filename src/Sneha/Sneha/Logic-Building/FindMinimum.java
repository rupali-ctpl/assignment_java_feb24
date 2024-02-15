public class FindMinimum {

    public static int findMin(int[] a){
         int min = a[0];

         for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
         }
         return min;
    }
    public static void main(String[] args) {
        int[] a = {3,7,2,9,5};
        

        System.out.println("The minimum value is: "+findMin(a));
        
    }
}
