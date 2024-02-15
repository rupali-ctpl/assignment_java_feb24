
public class rotateArray {

    
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8};
        int tem = A[A.length-1];
        for (int i = A.length-1; i > 0 ; i--) {
            A[i] =A[i-1];    
        }
        A[0] = tem;
        for (int x : A) {
            System.out.print(x+",");
        }
    }
}
