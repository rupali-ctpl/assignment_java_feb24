import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};

        System.out.println(mergeArrays(a,b));
    }

    public static int[] mergeArrays(int[] a, int[] b){
        int aa = a.length+b.length;
         int[] m = new int[aa];
         for(int i=0;i<m.length;i++){
            m[i] = a[i];

         }
         for(int j=0;j<m.length-1;j++){
            m[j] = b[j];

         }

        Arrays.sort(m);

        return m;
    }
}
