package Shrawani.OOP;

class Shape{
    void meth(){
        System.out.println("This is a shape");
    }
}
class Rectangle1 extends  Shape{
    void print(){
        System.out.println("This is rectangular shape.");
    }
}
class Circle extends  Shape{
    void print(){
        System.out.println("This is circular shape. ");
    }
}
public class Eleven {
    public static void main(String[] args) {
        Shape s= new Shape();
        Circle c= new Circle();
        Rectangle1 r= new Rectangle1();
        s.meth();
        c.meth();
        r.meth();

    }
}
