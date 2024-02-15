import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and breadth ");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();

        int area=(int)(num1*num2);
        System.out.println("Area of rectangle is : "+area);
    }
}
