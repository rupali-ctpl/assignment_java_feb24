import java.util.Scanner;

public class CostCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Quantity : ");
 
        int q=sc.nextInt();
        float cost=100*q;
        float dis=0.1f;

        if(cost>1000){
            cost = cost - (dis*cost);
        }
        System.out.println("Cost : "+cost);
    }
}
