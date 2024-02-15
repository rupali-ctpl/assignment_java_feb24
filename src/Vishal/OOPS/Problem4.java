class Triangle2{
    public double length;
    public double breadth;
    public double height;

    Triangle2(double l, double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }

    public void area(){
        double s=(length+breadth+height)/2f;
        double area=Math.sqrt(s*(s-length)*(s-breadth)*(s-height));
        
        System.out.println("area is " + area);
    }
    public void perimeter(){
        double p = (length + breadth+ height);
        System.out.println("perimeter is " +p);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Triangle2 t2 = new Triangle2(3,4,5);
        t2.area();
        t2.perimeter();
    }
}
