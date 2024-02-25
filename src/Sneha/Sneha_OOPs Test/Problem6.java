import java.util.*;
//class for area of traingle
class AreaOfTriangle{
    int length;
    int breadth;
    //constructor of are of triangle
    AreaOfTriangle(int l,int b){
        length =l;
        breadth=b;
    }
    //function to return the area of triangle
     public int returnArea(){
        return length*breadth;
     }
}
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask user to input values
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        AreaOfTriangle area = new AreaOfTriangle(length,breadth);
        System.out.println("Area of Rectangle is: "+area.returnArea());
        sc.close();
    }
}