import java.util.Scanner;

//class to calculate area of ractangle
class AreaOfRectangle {
  public int length;
  public int breath;

  // setDim method to initialise dimensions of rectangle
  public void setDim(int l, int b) {
    length = l;
    breath = b;
  }

  // getArea method to calculate area of rectangle
  public int getArea() {
    return (length * breath);
  }
}

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l = sc.nextInt();
    System.out.println("Enter breath");
    int b = sc.nextInt();
    AreaOfRectangle rectangle = new AreaOfRectangle();
    rectangle.setDim(l, b);
    System.out.println("Area of rectangle is " + rectangle.getArea());
  }

}
