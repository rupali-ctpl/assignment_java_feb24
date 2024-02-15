import java.util.*;
public class ifelse1 {

  public static void main(String arg[]){
  Scanner sc = new  Scanner(System.in);
  System.out.println("Enter length");
  int length = sc.nextInt();
  System.out.println("Enter breath");
  int breath = sc.nextInt();
  if(length == breath){
    System.out.println("Rectangle is Square");
  }
  else{
    System.out.println("Rectangle is not Square");
  }
}
}
