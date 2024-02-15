package shreyashHake.question5;

/** Question 5 */
public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return  length * breadth;
    }

    public static void main(String[] args) {
        Rectangle instanceOne = new Rectangle(4, 5);
        System.out.println("Length of rectangle with side 4 and 5 : " + instanceOne.getArea());

        Rectangle instanceTwo = new Rectangle(5, 8);
        System.out.println("\nLength of rectangle with side 5 and 8 : " + instanceTwo.getArea());

    }
}
