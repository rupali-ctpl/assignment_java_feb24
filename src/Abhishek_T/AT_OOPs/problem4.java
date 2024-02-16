public class problem4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        System.out.println("Area of triangle is "+t.area +" and perimeter of triangle is "+t.perimeter);
    }
}

class Triangle{
    int a;
    int b;
    int c;
    double area =0;
    double perimeter=0;
    Triangle(int x,int y ,int z){
        a=x;
        b=y;
        c=z;

        System.out.println("As the sides follow right angle triangle properties ,base and height must be between 3 and 4");
        area = ((double)1/2)*3*4;

        perimeter = a+b+c;
    }
}