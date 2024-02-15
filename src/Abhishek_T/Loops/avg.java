import java.util.*;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 values");
        double avg =0;
        for(int i=0;i<10;i++){
         avg =avg+sc.nextDouble();
        }
        avg =avg/10;
        System.out.println("The avg of the 10 numbers is "+avg);
    }
}
