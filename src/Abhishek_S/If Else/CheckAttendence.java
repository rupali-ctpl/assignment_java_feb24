import java.util.Scanner;

public class CheckAttendence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total classes : ");
        float total=sc.nextFloat();

        System.out.println("Enter attended classes : ");
        float att=sc.nextFloat();

        float per=(att/total)*100;

        if(per>=75){
            System.out.println("Student allowed for test");
        }
        else System.out.println("not allowed");
    }
}
