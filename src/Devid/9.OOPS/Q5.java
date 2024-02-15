class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int CalculateArea() {
        return length * breadth;
    }
}

class Rectangle1 extends Rectangle {

    public Rectangle1(int length, int breadth){
    super.length;
    super.breadth;
    }

    @Override
    public int CalculateArea() {
        return length * breadth;
    }
}

public class Q5 {
    public static void main(String[] args) {

    }
}
