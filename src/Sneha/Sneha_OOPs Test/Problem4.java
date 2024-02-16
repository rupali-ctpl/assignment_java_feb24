class Triangle2{
    int s1,s2,s3;

    public Triangle2(int s1, int s2, int s3) {
        //TODO Auto-generated constructor stub
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }


   
   

    public int getArea(){
        return s1*s2*s3;
    }

    public int getPerimeter(){
        return 2*(s1+s2+s3);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Triangle2 t2 = new Triangle2(3,4,5);
        System.out.println(t2.getArea());
        System.out.println(t2.getPerimeter());

    }
}
