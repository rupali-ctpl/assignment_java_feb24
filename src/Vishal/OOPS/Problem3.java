class Triangle{
    public double length;
    public double breadth;
    public double height;

    public void area(){
        
        double s=(length+breadth+height)/2f;
        double area=Math.sqrt(s*(s-length)*(s-breadth)*(s-height));
        
        System.out.println("area is " + area);
    }
    public void perimeter(){
        double p = (length + breadth+ height);
        System.out.println("perimeter is " +p);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Triangle t  = new Triangle();
        t.length = 3;
        t.breadth = 4;
        t.height = 5;
        t.area();
        t.perimeter();
    }
}
