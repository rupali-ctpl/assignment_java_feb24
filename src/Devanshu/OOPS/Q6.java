import java.util.Scanner;

class Area{
    int length;
    int breadth;

    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;
    }
}




public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        Area a=new Area(length, breadth);

        System.out.println("Area of rectangle: "+a.area());
    }
}
