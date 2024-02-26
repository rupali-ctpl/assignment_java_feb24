/**
 * The Rectangle class that represent Rectangle && method to find the area  of the Rectangle.
 */
class Rectangle{
    private int length;
    private int breadth;
    /**
     * 
     * @param l represents the length of the Rectangle
     * @param b represents the breadth of the Rectangle
     */
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    /**
     * 
     * @return area of the Rectangle (length multiplied by breadth)
     */
    public int  Area()
    {
        return length* breadth;
    }
}
public class Problem5 {
    public static void main(String[] args) {
        /**
         * Creating a r1 object of Rectangle class and initializing with some perimeters
         */
        Rectangle r1 = new Rectangle(4,5);
        /**
         * Creating a r2 object of Rectangle class and initializing with some perimeters
         */
        Rectangle r2 = new Rectangle(5,8);
        /**
         * Methods to print area of the both rectangles.
         */
        System.out.println("Area of rectangle 1: "+r1.Area());
        System.out.println("Area of rectangle 2: "+r2.Area());
    }
}
