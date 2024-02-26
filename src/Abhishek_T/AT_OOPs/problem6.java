import java.util.Scanner;

 

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of length :");
        int length = sc.nextInt();

        System.out.println("Enter the value of breadth :");
        int breadth = sc.nextInt();

        Area obj1 = new Area(length, breadth);
        double area = obj1.returnArea();

        System.out.println("Area of the rectangle is "+area);

        
        
    }
}

// class for calculating the area of the rectangle
class Area{
   private int length;
   private int breadth;

   // constructor for initializing the parameters
    Area(int len,int br){
        length =len;
        breadth =br;
    }

    //getter method to return area
    double returnArea(){
          return length*breadth;
    }
}
