// class of triangle to get area and perimeter
class Triangle2{
    public double length;
    public double breadth;
    public double height;

    //constructor of triangle to sset values
    Triangle2(double l, double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    // function to get area
    public void area(){
        double s=(length+breadth+height)/2f;
        double area=Math.sqrt(s*(s-length)*(s-breadth)*(s-height));
        System.out.println("area is " + area);
    }
    //function to get perimeter
    public void perimeter(){
        double perimeter = (length + breadth+ height);
        System.out.println("perimeter is " +perimeter);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Triangle2 t2 = new Triangle2(3,4,5);
        t2.area();
        t2.perimeter();
    }
}