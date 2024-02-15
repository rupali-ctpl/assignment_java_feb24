import java.util.*;
public class input2 {

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter two integer");
  
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = (a+b);
  int d = (a*b);
  System.out.println("Sum of result is  " + (c+d));
  System.out.println("Product of result :  " +(c*d));
  
}

}

