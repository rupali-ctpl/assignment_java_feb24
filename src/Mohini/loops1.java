import java.util.*;
public class loops1 {

  public static void main(String[] args) {
    System.out.println("Enter 10 numbers");
  Scanner sc = new  Scanner(System.in); 
  int sum =0;
  for(int i= 1;i<11;i++){
    int n = sc.nextInt(i);
    sum = sum + n;
  }
  System.out.println("average of numbers is "+(sum/10));
  }
}
