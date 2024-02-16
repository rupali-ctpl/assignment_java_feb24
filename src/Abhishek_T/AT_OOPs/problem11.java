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

class Shape{
    void printshape(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectagle(){
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape{
    void printCircle(){
        System.out.println("This is circular shape");
    }
}
