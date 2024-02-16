
package oops;
import java.util.*;
class Area{
  public int length;
  public int breath;

  public Area(int a,int b){
    length = a;
    breath = b; 
  }
  // public void setDim(int a,int b){
  //   length = a;
  //   breath = b;
  // }
  public int getArea(){
    return (length*breath);
  }
}

public class que1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();

    Area a = new Area(l,b);
    //a.setDim(2,4);
    System.out.println("Area of rectangle is "+a.getArea());
  }
  
}
