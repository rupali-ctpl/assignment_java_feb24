import org.w3c.dom.css.Rect;

public class problem5 {
    public static void main(String[] args) {
        // creating first object for given length and breadth
        Rectangle obj1 = new Rectangle(5, 4);
        double area = obj1.getArea();
         
        // creating second object for given length and breadth
        Rectangle obj2 = new Rectangle(8, 5);
        double area2 = obj2.getArea();

        System.out.println("Area of the first rectangle is "+ area +" and area of the second rectangle is "+area2);
        
    }
}

// class for calculating the area of the rectangle
class Rectangle{
    private int length;
    private int breadth;

    // constructor for initializing
    Rectangle(int length,int breadth){
        this.length =length;
        this.breadth =breadth;
    }

    // getter method to return the area
    double getArea(){
          return length*breadth;
    }
}
