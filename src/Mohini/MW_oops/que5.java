package oops;
class Rectangle{
  public int a ;
  public int b;
  public Rectangle(int a , int b){
    this.a = a;
    this.b = b;
  }
  public int area(){
    return (a*b);
  }
}
public class que5 {
  public static void main(String[] args) {
    Rectangle R1 = new Rectangle(4,5);
    Rectangle R2 = new Rectangle(5,8);
    System.out.println("area of 1st triangle "+R1.area());
    System.out.println("area of 2nd triangle "+R2.area());
  }
  
}
