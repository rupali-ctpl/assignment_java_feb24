

import java.util.Scanner;

class Area{
    int length;
    int breadth;

    public void setDim(int l,int b){
        length = l;
        breadth = b;
    }

    public int getArea(){
        return length*breadth;
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of rectangle");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();

        Area a=new Area();
        a.setDim(length, breadth);

        System.out.println(a.getArea());
    }
}
