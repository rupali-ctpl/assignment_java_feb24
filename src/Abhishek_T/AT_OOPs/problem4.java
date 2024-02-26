public class problem4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        double area = t.getArea();
        double perimeter = t.getPerimeter();
        System.out.println("Area of triangle is "+area +" and perimeter of triangle is "+perimeter);
    }
}

// class for calculating the area and perimeter of the triangle
class Triangle{
    private int side1;
    private int side2;
    private int side3;
    double area =0;
    double perimeter=0;

    // constructor for intializing and calculating the area and perimter
    Triangle(int x,int y ,int z){
        side1=x;
        side2=y;
        side3=z;

        //As the sides follow right angle triangle properties ,base and height must be between 3 and 4
        area = ((double)1/2)*side1*side2;
        perimeter = side1+side2+side3;
    }

    // getter method to return area of the triangle
    double getArea(){
        return area;
    }
    
    // getter method to return perimeter of the triangle
    double getPerimeter(){
        return perimeter;
    }
}