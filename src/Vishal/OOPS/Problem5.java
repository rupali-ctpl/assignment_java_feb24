class Rectangle{
    public int length;
    public int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public int  Area()
    {
        return length* breadth;
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        System.out.println("Area of rectangle 1: "+r1.Area());
        System.out.println("Area of rectangle 2: "+r2.Area());
    }
}
