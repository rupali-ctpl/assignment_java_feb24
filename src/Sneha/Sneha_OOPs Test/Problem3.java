class Triangle{
    public double length;
    public double breadth;
    public double height;
    
    // function to get the area
    public void area(){
        double s=(length+breadth+height)/2f;
        double area=Math.sqrt(s*(s-length)*(s-breadth)*(s-height));
        System.out.println("Area of traingle is: " + area);
    }
    // function to get perimeter of triangle
    public void perimeter(){
        double perimeter = (length + breadth+ height);
        System.out.println("Perimeter of triangle is: " +perimeter);
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Triangle triangle  = new Triangle();
        // set the values;
        triangle.length = 3;
        triangle.breadth = 4;
        triangle.height = 5;
        triangle.area();
        triangle.perimeter();
    }
}