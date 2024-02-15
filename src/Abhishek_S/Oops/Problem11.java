
class Shape{
    public void display(){
        System.out.println("This is shape class");
    }
}

class Rectangle extends Shape{
    public void display(){
        System.out.println("This is Rectangular class");
    }
}

class Circle extends Shape{
    public void display(){
        System.out.println("This is circular class");
    }
}

public class Problem11 {
    public static void main(String[] args) {
        Shape s1=new Shape();
        Shape s2=new Rectangle();
        Shape s3=new Circle();

        s1.display();
        s2.display();
        s3.display();
    }
}
