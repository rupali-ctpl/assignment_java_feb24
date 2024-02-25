class Rectangle{
    int length;
    int breadth;

    //constructor of rectangle to set the values
   public  Rectangle(int length,int breadth){
       this.length =length;
       this.breadth=breadth;
    }
    // function to get area of rectangle
    public int getArea(){
        return length*breadth;
    }
}
public class Problem5 {
    public static void main(String[] args) {
        //creating the constructor to set values
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of Rectangle 1: "+r1.getArea());
        System.out.println("Area of Rectangle 2: "+r2.getArea());
    }
}
