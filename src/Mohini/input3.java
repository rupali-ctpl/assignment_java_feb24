
import java.util.*;
public class input3 {

  public static void main(String arg[]){
  Scanner sc = new  Scanner(System.in);
  System.out.println("Enter double length");
   double length = sc.nextDouble();
  System.out.println("Enter double breath");
  double breath = sc.nextDouble();
  double area = length*breath;
  System.out.println("Area of rectangle is "+(int)area+ " units");

}
}
