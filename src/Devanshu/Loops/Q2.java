import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,prod=1;
        int i=-1;
        while(true){

            String  x=sc.next();
            i++;
            if(x.charAt(0)=='q') break;
            System.out.println("Press q to exit");
            sum=sum+Integer.parseInt(x);
            prod=prod*Integer.parseInt(x);
        }
        System.out.println("Avg is "+sum/(float)i);
        System.out.println("Product is "+prod);

    }
}
