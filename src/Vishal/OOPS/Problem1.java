import java.util.Scanner;
 /**
  * The area class that represent Rectanglr && method to find the area of rectangle.
  */
class Area{
    /**
     * Given variable represent length and Breadth of rectangle.
     */
    private int length;
    private int breadth;
    /**
     * Method to set Dimension of rectangle
     * @param l represent length of the rectangle
     * @param b represent breadth of the rectangle
     */
    public void setDim(int l ,int b){
        length = l; 
        breadth = b;
    }
    /**
     * 
     * @return the area of the rectangle 
     */
    public int getArea(){
        return length* breadth;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        /**
         * setting the dimensions of the rectangle
         */
        a.setDim(l, b);
        System.out.println("Area of rectangle "+a.getArea());
        sc.close();
    }
}
