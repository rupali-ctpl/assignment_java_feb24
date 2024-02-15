import java.util.Scanner;

public class FindAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();

        int area=side*side;
        int perimeter=4*side;
        
        System.out.println("Area of square : "+area);
        System.out.println("Perimeter of square : "+perimeter);
        
    }
}
