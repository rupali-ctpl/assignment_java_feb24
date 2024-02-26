import java.util.Scanner;

class Area {
    // Variable to store the length and breadth
    public int length;
    public int breadth;
    // Constructor with parameter
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Method to calculate area
    public int returnArea() {
        return length * breadth;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the input from user
        System.out.println("Enter the value of length: ");
        int length = sc.nextInt();
        System.out.println("Enter the value of breadth: ");
        int breadth = sc.nextInt();
        Area obj = new Area(length, breadth);
        // Printing the result
        System.out.println("Area Of Rectangle is " + obj.returnArea() + " units");
    }
}
