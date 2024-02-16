import java.util.Scanner;

 

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of length and breadth of rectangle");
        int len = sc.nextInt();
        int br = sc.nextInt();
        Area obj1 = new Area(len, br);
        System.out.println("Area of the rectangle is "+obj1.returnArea());

        
        
    }
}

class Area{
    int length;
    int breadth;

    Area(int len,int br){
        length =len;
        breadth =br;
    }
    double returnArea(){
          return length*breadth;
    }
}
