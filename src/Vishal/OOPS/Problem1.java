import java.util.Scanner;

class Area{
    public int length;
    public int breadth;
    public void setDim(int l ,int b){
        length = l; 
        breadth = b;
    }
    public int getArea(){
        return length* breadth;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        a.setDim(l, b);

        System.out.println("Area of rectangle "+a.getArea());
        sc.close();
    }
}
