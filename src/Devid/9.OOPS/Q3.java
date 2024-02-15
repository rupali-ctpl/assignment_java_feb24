class Triangle{
    public int side1;
    public int side2;
    public int side3;

    public  Triangle(){
        this.side1 = 3;
        this.side2 = 4;
        this.side1 = 5;
    }

    public double CalculateArea(){
        double s = (side1 + side2 + side3)/3;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
        
    }
    public double CalculatePerimeter(){
        double perimeter = (side1 + side2 + side3);
        return perimeter;
        
    }
}
public class Q3 {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        System.out.println("Area is : "+ obj.CalculateArea());
        System.out.println("Perimeter is : "+ obj.CalculatePerimeter());
    }
}
