

public class Q1 {

    static void area(int l,int b){
        System.out.println("Area of rectangle is "+l*b);
    }
    static void perimeter(int l,int b){
        System.out.println("Perimeter of rectangle is "+2*(l+b));
    }
    public static void main(String[] args) {
        int l=5,b=7;
        area(l,b);
        perimeter(l,b);
    }
}
