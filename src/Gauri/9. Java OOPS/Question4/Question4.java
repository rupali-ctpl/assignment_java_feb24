    // class to find area and perimeter of a triangle
    class Triangle {
        // declaring data members - three sides of triangle as a, b, c
        private int a, b, c;
        // constructor which takes three sides of triangle as parameters
        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
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

    public class Question4 {
        public static void main(String[] args) {
            // instantiating the object of Triangle class, with constructor having 3, 4, 5 as parameters
            Triangle t = new Triangle(3, 4, 5);
            // printing the area of triangle
            System.out.println("Area: " + t.getArea());
            // printing the perimeter of triangle
            System.out.println("Perimeter: " + t.getPerimeter());
        }
    }
