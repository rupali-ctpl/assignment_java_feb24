public class problem11 {
    public static void main(String[] args) {
        Shape s = new Shape();
        //calling Shape class method
        s.printshape();
        
        Rectangle r = new Rectangle();
        //calling rectangle class method
        r.printRectagle();

        Circle c = new Circle();
        //calling Circle class method
        c.printCircle();
    }
}

// Shape parent class 
class Shape{
    void printshape(){
        System.out.println("This is shape");
    }
}

// Rectagle class extending the shape class
class Rectangle extends Shape {
    void printRectagle(){
        System.out.println("This is rectangular shape");
    }
}

// Circle class extending the shape class
class Circle extends Shape{
    void printCircle(){
        System.out.println("This is circular shape");
    }
}
