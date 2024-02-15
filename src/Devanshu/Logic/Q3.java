

import java.util.Scanner;

public class Q3 {

    static int findMinimum(int arr[]){
        int mini=Integer.MAX_VALUE;

        for(int i:arr){
            if(i<mini)
                mini=i;
        }
        return mini;
    }
    public static void main(String[] args) {
        
        int arr[]={11,3,5,2};

        System.out.println(findMinimum(arr));

        
    }
}
