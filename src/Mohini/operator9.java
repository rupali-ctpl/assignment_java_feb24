import java.util.Scanner;

public class operator9 {
  public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
   System.out.println("ENTER THREE DIGIT NUMBER");
   int n= s.nextInt();
   int rev = 0;
   while(n!=0){
    int digit = n%10;
    rev = (rev*10)+digit;
    n = n/10;
   }
   System.out.println("reversed no is " + rev);
   
  }
}
