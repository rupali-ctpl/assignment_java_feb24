package oops;
class triangle{
  private int a;
  private int b;
  private int c;

  public void setabc(int a , int b,int c){
    this.a=a;
    this.b =b;
    this.c =c;
  }

  public int area(){
    return ((a+b+c)/3);
  }
  public int perimeter(){
    return (a+b+c);
  }

}
public class que3 {
  public static void main(String[] args) {
    triangle t = new triangle();
    t.setabc(2,4,5);
    System.out.println("area "+t.area());
    System.out.println("Perimeter "+t.perimeter());
  
  }
  
}
