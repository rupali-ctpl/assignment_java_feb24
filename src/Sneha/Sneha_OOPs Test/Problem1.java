import java.util.Scanner;
//class to calculate area
class Area {
    // declare length and breadth
    public int length;
    public int breadth;

    //function to set length and breadth
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //function to calculate area
    public int getArea() {
        return length * breadth;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner sc = new Scanner(System.in);
        // ask user to enter values
        System.out.println("Enter first number: ");
        int length = sc.nextInt();
        System.out.println("Enter second number: ");
        int breadth = sc.nextInt();
        //calling function to set values
        area.setDim(length, breadth);
        //calling function to print area
        System.out.println(area.getArea());
        sc.close();
    }
}