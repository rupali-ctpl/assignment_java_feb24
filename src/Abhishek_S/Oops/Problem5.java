
class Rectangle{
      int length=0,breadth=0;
      Rectangle(int length,int breadth){
          this.length=length;
          this.breadth=breadth;
      }

      public int area(){
        return (length*breadth);
      }
}

public class Problem5 {
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle(4, 5);
        Rectangle obj2=new Rectangle(5, 8);

        System.out.println("Area of first rectangle is : "+obj1.area());
        System.out.println("Area of second rectangle is : "+obj2.area());

    }
}
