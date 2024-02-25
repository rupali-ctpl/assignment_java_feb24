// class shape
class Shape{
    public void shapemethod(){
        System.out.println("This is shape");
    }
}
//class rectangle extends shape
class Rectangle extends Shape{
    public void reactngleMethod(){
        System.out.println("This is rectangle");
    }
}
//class circle extends shape
class Circle extends Shape{
    public void circleMethod(){
        System.out.println("This is circle");
    }
}
public class Problem11 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.shapemethod();
        Rectangle r = new Rectangle();
        r.reactngleMethod();
        Circle c = new Circle();
        c.circleMethod();
    }
}