import java.util.*;
public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("enter length and breadth");
        int len = sc.nextInt();
        int bredth = sc.nextInt();
        a.setDim(len,bredth);
        System.out.println("The area of the rectangle is "+a.getArea());

    }
}

class Area{
    int length;
    int breadth;
    void setDim(int len,int br){
        length =len;
        breadth =br;
    }
    int getArea(){
        return length*breadth;
    }
}