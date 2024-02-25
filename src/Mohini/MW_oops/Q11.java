//class shape having mwthod print
class shape{
  public void print(){
    System.out.println("This is shape");
  }
}
//class restangle extending from class shape 
class rectangle extends shape{
  public void print(){
    System.out.println("This is rectangle");
  }

}
//class circle extending from class shape 
class circle extends shape{
  public void print(){
    System.out.println("This is circle");
  }
  
}
public class Q11 {
  public static void main(String[] args) {
    shape s = new shape();
    rectangle r = new rectangle();
    circle c = new circle();
    s.print();
    r.print();
    c.print();
  }
}
