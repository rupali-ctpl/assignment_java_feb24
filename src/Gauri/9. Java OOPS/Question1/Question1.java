import java.util.*;

// class to find area of rectangle
class Area {
    // declaring private data members
    private int length;
    private int breadth;

    // method to set the length and breadth of rectangle
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to return area of rectangle
    public int getArea() {
        return length * breadth;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input of length and breadth from user
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();
        // instantiating the object of Area class
        Area a = new Area();
        // setting the length and breadth of the rectangle
        a.setDim(length, breadth);
        // printing the area of rectangle
        System.out.println(a.getArea());
    }
}
