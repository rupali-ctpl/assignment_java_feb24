public class problem3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        double area = t.getArea();
        double perimeter = t.getPerimeter();
        System.out.println("Area of triangle is "+area +" and perimeter of triangle is "+perimeter);
    }
}

// class for calculating the area and perimeter of triangle with provided info
class Triangle{
    int side1 =3;
    int side2 =4;
    int side3=5;
    private double area =0;
    private double perimeter=0;

    // constructor for initializing 
    Triangle(){ 
        // as per the diamension mentioned ,given triangle is right angled triangle and base and height must be between
        // 3 and 4 as 5 is the diamension of hypotenius  
        area = ((double)1/2)*side1*side2;
        perimeter = side1+side2+side3;
    }

    // getter method to return area
    double getArea(){
        return area;
    }

    // gettter method to return perimeter
    double getPerimeter(){
        return perimeter;
    }
}