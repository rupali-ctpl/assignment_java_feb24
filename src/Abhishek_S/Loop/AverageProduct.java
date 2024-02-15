import java.util.Scanner;

public class AverageProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String num;
        double sum=0,pro=1;
        int numCnt=0;
        while(true){
           System.out.println("Enter 'q' to quit : " );
           num=sc.next();
           if(num.charAt(0)=='q'){
            break;
           }
           int n=Integer.parseInt(num);
           pro *=n;
           sum +=n;
           numCnt++;
        }

        double avg=sum/numCnt;
        System.out.println("Average of numbers is : "+avg);
        System.out.println("Product of numbers is : "+pro);
    }
}
