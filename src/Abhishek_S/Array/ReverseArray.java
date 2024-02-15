import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
        
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        int reverseArr[]=new int[10];

        for(int i=0;i<10;i++){
            reverseArr[i]=arr[10-i-1];
        }

        System.out.println("Original Array : ");
        for(int i=0;i<10;i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Reversed Array : ");
        for(int i=0;i<10;i++) System.out.print(reverseArr[i] + " ");
    }
}
