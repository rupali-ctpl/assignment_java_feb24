public class Q11_Shape {

    void printShape() {
        System.out.println("this is shapes");
    }

    public static class Rectangle extends Q11_Shape {
        void printShape() {
            System.out.println("this is Rectangle");
        }
    }

    public static class Circle extends Q11_Shape {
        void printShape() {
            System.out.println("this is circle");
        }
    }

    public static void main(String[] args) {

        Q11_Shape s1 = new Q11_Shape();
        s1.printShape();

        Rectangle R1 = new Rectangle();
        R1.printShape();

        Circle c1 = new Circle();
        c1.printShape();

    }

}
