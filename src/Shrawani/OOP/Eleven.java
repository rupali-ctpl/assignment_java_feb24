package Shrawani.OOP;

// Shape class
class Shape {
    void print() {
        System.out.println("This is a shape");
    }
}

// Rectangle class
class Rectangle1 extends Shape {
    void print() {
        System.out.println("This is rectangular shape.");
    }
}

//Circle class
class Circle extends Shape {
    void print() {
        System.out.println("This is circular shape. ");
    }
}

public class Eleven {
    public static void main(String[] args) {

        //Instances
        Shape s = new Shape();
        Circle c = new Circle();
        Rectangle1 r = new Rectangle1();

        s.print();
        c.print();
        r.print();

    }
}
