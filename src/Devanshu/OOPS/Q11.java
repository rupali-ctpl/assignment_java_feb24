class Shape{
    public void display(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    public void display(){
        System.out.println("This is Rectangular shape");
    }
}

class Circle extends Shape{
    public void display(){
        System.out.println("This is Circular shape");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.display();
        r.display();
        c.display();
        
    }
}
