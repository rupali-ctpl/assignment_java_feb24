// class to find area of rectangle
class Rectangle {
    private int length;
    private int breadth;

    // constructor which takes length and breadth of rectangle as parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to return area of rectangle
    public int getArea() {
        return length * breadth;
    }
}

public class Question5 {
    public static void main(String[] args) {
        // instantiating the objects of Rectangle class, with constructor having 4, 5
        // and 5, 8 as parameters respectively
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        // printing the areas of the rectangles
        System.out.println("Area of R1: " + r1.getArea());
        System.out.println("Area of R2: " + r2.getArea());
    }
}
