/**
 * Class Shape having method print()
 */
class Shape{
    public void print(){
        System.out.println("This is shape");
    }
}
/**
 * Class Shape extends from Shape class and overrides print() method
 */
class Rectangle extends Shape{
    public void print(){
        System.out.println("This is rectangular shape");
    }
}
/**
 * Class Circle extends from Shape class and overrides print() method
 */
class Circle extends Shape{
    public void print(){
        System.out.println("This is circular shape");
    }
}
public class Problem11 {
    public static void main(String[] args) {
        /**
         * Creating the Object of the Shape class
         * And calling the print() method of the smae class
         */
        Shape shape = new Shape();
        shape.print();
        /**
         * Creating the Object of the rectangle class
         * And calling the print() method of the same class
         */
        Rectangle rectangle = new Rectangle();
        rectangle.print();
        /**
         * Creating the Object of the circle class
         * And calling the print() method of the same class
         */
        Circle circle = new Circle();
        circle.print();
    }
}
