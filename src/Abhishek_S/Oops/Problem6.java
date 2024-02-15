import java.util.Scanner;

class Area{
    int length,breadth;
    Area(int length,int breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    public int returnArea(){
        return (length*breadth);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bred=sc.nextInt();

        Area obj=new Area(len,bred);
        System.out.println("Area of rectangle is : " +obj.returnArea());
    }
}
