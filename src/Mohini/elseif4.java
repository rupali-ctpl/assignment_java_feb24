import java.util.*;
public class elseif4{

  public static void main(String arg[]){
Scanner sc = new  Scanner(System.in);
  System.out.println("Enter Marks");
  int m = sc.nextInt();
  if(m<25){
    System.out.println("Grade: F");
  }
  if(m>=25 && m<=45){
    System.out.println("Grade: E");
  }
  if(m>45 && m<=50){
    System.out.println("Grade: D");
  }
  if(m>50 && m<=60){
    System.out.println("Grade: C");
  }
  if(m>60 && m<=80){
    System.out.println("Grade: B");
  }
  if(m>80){
    System.out.println("Grade: A");
  }
  }
}
