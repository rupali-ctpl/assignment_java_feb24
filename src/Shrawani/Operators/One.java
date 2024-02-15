package Shrawani.Operators;

class Rectangle{
    double a, b;
    Rectangle(double a, double b){
        this.a= a;
        this.b=b;
    }
    void Area(){
        System.out.println("Area of Rectangle is: "+ a*b);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle is: "+ (2*(a+b)));
    }
}
public class One {

    public static void main(String[] args) {
        Rectangle r =new Rectangle(5, 7);
        r.perimeter();
        r.Area();


    }
}
