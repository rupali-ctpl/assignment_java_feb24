import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter the marks : ");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.println("A grade");
        }
        else if(marks>=60 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=50 && marks<60){
            System.out.println("C grade");
        }
        else if(marks>=45 && marks<50){
            System.out.println("D grade");
        }
        else if(marks>=25 && marks<45){
            System.out.println("E grade");
        }
        else System.out.println("F grade");
    }
}
