public class Q5_Rectangle {

    int length;
    int breadth;

    Q5_Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    public static class Rectangle2 extends Q5_Rectangle {

        Rectangle2(int length, int breadth) {
            super(length, breadth);
        }

        int area() {
            return length * breadth;
        }

    }

    public static void main(String[] args) {
        Q5_Rectangle R1 = new Q5_Rectangle(2, 3);

        System.out.println(R1.area());

        Rectangle2 R2 = new Rectangle2(4, 5);
        System.out.println(R2.area());

    }

}
