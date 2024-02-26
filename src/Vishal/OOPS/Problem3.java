/**
 * The Triangle class that represent Triangle && method to find the area & perimeter of the Triangle.
 */
class Triangle{
    private double length;
    private double breadth;
    private double height;
    /**
     * @param length represent the length of the triangle
     * @param breadth represent the depth of the triangle
     * @param height represent the height of the triangle
     */
    public void setDimensions(double length, double breadth, double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
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

public class Problem3 {
    public static void main(String[] args) {
        Triangle t  = new Triangle();
        /**
         * Method setDimensions() sets the dimensions of the triangle.
         */
        t.setDimensions(3,4,5);
        t.area();
        t.perimeter();
    }
}
