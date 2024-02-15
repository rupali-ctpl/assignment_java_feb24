import java.util.*;
public class Loops1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int[] a = new int[10];

        System.out.println("Enter 10 values: ");
        for(int i=0;i<10;i++){
           
            a[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<10;i++){
          sum+=a[i];
        }

        System.out.println("Average is "+(sum/10));

    }
}
