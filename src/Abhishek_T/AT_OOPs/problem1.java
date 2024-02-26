import java.util.*;


public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("enter length :");
        int length = sc.nextInt();
        System.out.println("enter breadth:");
        int bredth = sc.nextInt();
        a.setDim(length,bredth);
        double area = a.getArea()
        System.out.println("The area of the rectangle is "+area);

    }
}

// class for calculating the area of the rectangle
class Area{
   private int length;
   private int breadth;
   // setter method to set the diamension
    void setDim(int len,int br){
        length =len;
        breadth =br;
    }
    
    //getter method to get the area
    int getArea(){
        return length*breadth;
    }
}