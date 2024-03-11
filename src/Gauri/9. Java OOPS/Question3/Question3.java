// class to find area and perimeter of a triangle
class Triangle {
    // declaring data members - three sides of triangle as a, b, c
    int a, b, c;
    
    // method to return area of triangle
    public double getArea() {
        double area;
        double s = 0.5 * (a + b + c);
        area = Math.sqrt((s) * (s - a) * (s - b) * (s - c));
        return area;
    }
    
    // method to return perimeter of triangle
    public double getPerimeter() {
        return a + b + c;
    }
}

public class Question3 {
    public static void main(String[] args) {
        // instantiating the object of Triangle class
        Triangle t = new Triangle();
        // setting the three sides of the triangle
        t.a = 3;
        t.b = 4;
        t.c = 5;
        // printing the area of triangle
        System.out.println("Area: " + t.getArea());
        // printing the perimeter of triangle
        System.out.println("Perimeter: " + t.getPerimeter());
    }
}
