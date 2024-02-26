import java.util.Scanner;
/**
 * Class representing the Rectangle and having the Method returnArea to return the area of the rectangle.
*/
class Area{
    private double length;
    private double breadth;
    /**
     * 
     * @param l represents the length of the rectangle
     * @param b represents the breadth of the rectangle
     */
    Area(double l, double b){
        length = l;
        breadth = b;
    }
    /**
     * 
     * @return area of the rectangle (length multiplied by breadth)
     */
    public double returnArea(){
        return length*breadth;
    }
}
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Getting the user input for length of the Rectangle
         */
        System.out.print("Enter length ");
        double length = sc.nextDouble();
        /**
         * Getting the user input for breadth of the Rectangle
         */
        System.out.print("Enter  Breadth ");
        double breadth =sc.nextDouble();
        /**
         * Creating the Objects of the Rectangle and passing the perimeters to its constructor.
         */
        Area area = new Area(length, breadth);
        System.out.println("Area is: "+area.returnArea());
        sc.close();
    }
}
