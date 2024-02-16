import org.w3c.dom.css.Rect;

public class problem5 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(5, 4);
        double area = obj1.Area();

        Rectangle obj2 = new Rectangle(8, 5);
        double area2 = obj2.Area();

        System.out.println("Area of the first rectangle is "+ area +" and area of the second rectangle is "+area2);
        
    }
}

class Rectangle{
    int length;
    int breadth;

    Rectangle(int len,int br){
        length =len;
        breadth =br;
    }
    double Area(){
          return length*breadth;
    }
}
