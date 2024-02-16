class Shape{
    Shape(){

    }

    public void m1(){
        System.out.println("This is shape");
    }
}

class Rectangle11 extends Shape{
    Rectangle11(){

    }
    public void m1(){
        System.out.println("This is rectangle");
    }
}

class Circle extends Shape{
    Circle(){

    }

    public void m1(){
        System.out.println("This is circle");
    }
}
public class Problem11 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.m1();
        Rectangle11 r = new Rectangle11();
        r.m1();
        Circle c = new Circle();
        c.m1();
    }
}
