class Rectangle{
    int l;
    int b;

   public  Rectangle(int l,int b){
       this.l =l;
       this.b=b;

    }

    public int getArea(){
        return l*b;

    }
}
public class Problem5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
    }
}
