public class problem3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area of triangle is "+t.area +" and perimeter of triangle is "+t.perimeter);
    }
}

class Triangle{
    int a =3;
    int b =4;
    int c=5;
    double area =0;
    double perimeter=0;
    Triangle(){
        System.out.println("As the sides follow right angle triangle properties ,base and height must be between 3 and 4");
        area = ((double)1/2)*3*4;

        perimeter = a+b+c;
    }
}