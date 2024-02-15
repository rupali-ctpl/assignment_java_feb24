import java.util.Scanner;

class Area {
    public int length;
    public int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of length and breadth: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Area obj = new Area(a, b);
        int result = obj.returnArea();
        System.out.println("Area Of Rectangle is: " + result);

    }
}
