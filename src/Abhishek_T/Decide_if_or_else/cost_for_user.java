import java.util.*;

public class cost_for_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity for the user");
        long q = sc.nextLong();
        double cost =0;
        if(q>1000){
            cost = (double)(100*q)*((double)9/10);
        }
        else{
            cost = (double)(100*q);
        }
        System.out.println("Total cost for the user is "+ cost+" units");
    }
}
