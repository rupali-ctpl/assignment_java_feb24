class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area of rectangle is "+(length*breadth));
    }
}

public class Q5 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(5,8);

        r1.area();
        r2.area();
    }
}
