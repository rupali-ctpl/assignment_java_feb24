/**
 * The Triangle2 class that represent Triangle && method to find the area & perimeter of the Triangle.
 */
class Triangle2{
    private double length;
    private double breadth;
    private double height;
     /**
     * @param l represent the length of the triangle
     * @param b represent the depth of the triangle
     * @param h represent the height of the triangle
     */
    Triangle2(double l, double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    /**
     * prints  the area of the Triangle
     */
    public void area(){
        double s=(length+breadth+height)/2f;
        double area=Math.sqrt(s*(s-length)*(s-breadth)*(s-height));
        
        System.out.println("area is " + area);
    }
    /**
     * prints the perimeter of the Triangle.
     */
    public void perimeter(){
        double p = (length + breadth+ height);
        System.out.println("perimeter is " +p);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        /**
         * Create object of Triangle2 and calling its constructor with parameters.
         */
        Triangle2 t2 = new Triangle2(3,4,5);
        t2.area();
        t2.perimeter();
    }
}
