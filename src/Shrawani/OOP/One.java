package Shrawani.OOP;

import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return this.length;
    }
    public int getBreadth(){
        return  this.breadth;
    }

    public int getArea() {
        return (getLength()*getBreadth());
    }

}

public class One {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Area a= new Area();
        System.out.println("Enter the length: ");
        int l= sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b= sc.nextInt();
        a.setDim(l,b);
        int area= a.getArea();
        System.out.println("The area of rectangle is "+ area);
    }
}
