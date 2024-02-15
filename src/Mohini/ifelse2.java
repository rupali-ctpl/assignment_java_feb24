import java.util.*;
public class ifelse2 {

  public static void main(String arg[]){
  Scanner sc = new  Scanner(System.in);
  System.out.println("Enter 1st integer");
  int a = sc.nextInt();
  System.out.println("Enter 2nt integer");
  int b= sc.nextInt();
  if(a>b){
    System.out.println("Greatest is " +a);
  }
  else{
    System.out.println("Greatest is " +b);
  }
  }
}

