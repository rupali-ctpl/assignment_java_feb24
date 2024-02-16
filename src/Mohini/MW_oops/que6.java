package oops;
class Area{
public int length;
public int breath;

public Area(int a , int b){
  length = a;
  breath = b;
}

public int returnArea(){
  return (length*breath);
}


}
public class que6 {
  public static void main(String[] args) {
  Area a1 = new Area(4,5);
  System.out.println("area "+a1.returnArea());
  }
}
