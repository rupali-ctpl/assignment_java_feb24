import java.util.*;

// class to find area of rectangle
class Area {
    // declaring data members - length and breadth
    int length, breadth;
    // constructor which takes length and breadth as parameters
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // method to return area of rectangle
    public int returnArea() {
        return length * breadth;
    }
}

public class Question6 {
    public static void main(String[] args) {
        // taking input of length and breadth from user
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();
        // instantiating the object of Area class with a constructor by passing length and breadth
        Area a = new Area(length, breadth);
        // printing the area of rectangle 
        System.out.println(a.returnArea());
    }
}
