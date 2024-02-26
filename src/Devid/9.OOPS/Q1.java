import java.util.Scanner;
    // Class to calculate the area of a rectangle
class Area {
    public int length;
    public int breadth;
    // Method to set length and breadth
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Method to calculate area
    public int getArea() {
        return length * breadth;
    }
}

class Q1 {
    public static void main(String arg[]) {
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter the value of length: ");
        obj.length = sc.nextInt();
        System.out.println("Enter the value of breadth: ");
        obj.breadth = sc.nextInt();
        obj.setDim(obj.length, obj.breadth);
        // Printing the area
        System.out.println("Area of Rectangle is " + obj.getArea() + " units");
    }
}