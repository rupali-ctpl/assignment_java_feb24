//class Triangle to calculate area and perimeter of triangle
class Triangle {
  private int side1;
  private int side2;
  private int side3;

  // method to intialize sides of triangle
  public void setSides(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  // method to calculate area of triangle using formula
  // sqrt(s*(s-side1)*(s-side2)*(s-side3)) where s=(side1+side2+side3)/2
  public double area() {
    double s = ((side1 + side2 + side3) / 2);
    return ((Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))));
  }

  // method to calculate perimeter of triangle using formula (side1 + side2 +
  // side3)
  public int perimeter() {
    return ((side1 + side2 + side3));
  }

}

public class Q3 {
  public static void main(String[] args) {
    Triangle triangle = new Triangle();
    triangle.setSides(3, 4, 5);
    System.out.println("area: " + triangle.area());
    System.out.println("Perimeter : " + triangle.perimeter());

  }

}
