//class Rectangle to calculate area
class Rectangle {
  public int length;
  public int breath;

  // constructor for initializing length and breath
  public Rectangle(int length, int breath) {
    this.length = length;
    this.breath = breath;
  }

  // method to calculate area of rectangle
  public int area() {
    return (length * breath);
  }
}

public class Q5 {
  public static void main(String[] args) {
    Rectangle R1 = new Rectangle(4, 5);
    Rectangle R2 = new Rectangle(5, 8);
    System.out.println("area of 1st triangle " + R1.area());
    System.out.println("area of 2nd triangle " + R2.area());
  }

}