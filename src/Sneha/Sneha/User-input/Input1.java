import java.util.Scanner;

public class Input1{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("enter first number: ");
int a = sc.nextInt();

System.out.println("enter second number: ");
int b = sc.nextInt();

System.out.println("Addition is: "+a+b);
System.out.println("Product is: "+a*b);

sc.close();
    }
}
