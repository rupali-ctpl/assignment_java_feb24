import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num,sum=0;
        for(int i=0;i<10;i++){
           num=sc.nextInt();
           sum +=num;
        }

        double avg=(sum)/10;
        System.out.println("Average of numbers is : "+avg);
    }
}
