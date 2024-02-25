import java.util.*;

//Class to calculate area of rectangle
class Area {
  public int length;
  public int breath;

  // constuctor to initalize length and breath og ractangle
  public Area(int length, int breath) {
    this.length = length;
    this.breath = breath;
  }

  // method which return area of rectangle
  public int returnArea() {
    return (length * breath);
  }

}

public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length");
    int length = sc.nextInt();
    System.out.println("Enter breath");
    int breath = sc.nextInt();
    Area a1 = new Area(length, breath);
    System.out.println("area: " + a1.returnArea());
  }
}
