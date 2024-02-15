import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = array[9 - i];
        }
        for (int x : array2) {
            System.out.print(x+" ");
        }
    }
}
