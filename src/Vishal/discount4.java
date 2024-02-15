import java.util.Scanner;

public class discount4 {
    public static void main(String[] args) {
        double dis = 0.1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity ");
        int quantity = sc.nextInt();

        double cost = quantity* 100;
        double ans  = 0;
        if(cost  >= 1000.0)
        {
            double t = cost * dis;
            cost = cost - t; 
            ans = cost;  
        }
        else ans = cost;
        System.out.println("total cost is  " +ans);
       
        sc.close(); 

    }
}
