import java.util.*;

public class avg_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        double avg =0;
        double prod =1;
        int count=0;
        while(flag){
            System.out.println("enter the number");
            int i = sc.nextInt();
            avg = avg+i;
            prod = prod*i;
            count++;
            System.out.println("press q to quit ");
            String s = sc.next();
            char ch = s.charAt(0);
            if(ch=='q'){
                flag =false;
            }
        }
        avg = avg/count;

        System.out.println("The average of all the numbers is "+avg);
        System.out.println("The product of all the numbers is "+prod);
    }
}
