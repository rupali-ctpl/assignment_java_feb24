import java.lang.Math;
class Triangle{
    int s1,s2,s3;

    public void perimeter(){
        System.out.println("Perimeter of traingle is "+(s1+s2+s3));
    }

    public void area(){
        double s=(s1+s2+s3)/2;

        double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The area of the triangle is "+area);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.s1=3;
        t.s2=4;
        t.s3=5;

        t.perimeter();
        t.area();
    }
}
