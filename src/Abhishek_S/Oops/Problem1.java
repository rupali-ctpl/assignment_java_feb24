import java.util.Scanner;

class Area{
    private int length=0;
    private int breadth=0;

    public void setDim(int length,int breadth){
          this.length=length;
          this.breadth=breadth;
    }
    public int getArea(){
        int area=length*breadth;
        return area;
    }
}

public class Problem1{
    public static void main(String[] args) {
        System.out.println("Enter lenght and breadth : ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bread=sc.nextInt();

        Area obj=new Area();
        obj.setDim(len, bread);
        System.out.println("Area of reactangle is "+obj.getArea());
    }
}