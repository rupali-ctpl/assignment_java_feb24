import java.util.Scanner;

class Area{
    public double length;
    public double breadth;
    
    Area(double l, double b){
        length = l;
        breadth = b;
    }
    public double returnArea(){
        return length*breadth;
    }
}
public class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length & Breadth ");
        double length = sc.nextDouble();
        double breadth =sc.nextDouble();
        Area area = new Area(length, breadth);

        System.out.println("Area is: "+area.returnArea());
        sc.close();
    }
}
