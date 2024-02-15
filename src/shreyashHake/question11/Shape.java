package shreyashHake.question11;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Shape {
    public void print() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void print() {
        System.out.println("This is rectangle");
    }
}

class Circle extends Shape {
    public void print() {
        System.out.println("This is circle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print();

        Shape rectangle = new Rectangle();
        rectangle.print();

        Shape circle = new Circle();
        circle.print();
    }
}
