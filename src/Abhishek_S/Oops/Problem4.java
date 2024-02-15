
class  Triangle{
    int side1,side2,side3;
    Triangle(int a,int b,int c){
       this.side1=a;
       this.side2=b;
       this.side3=c;
    }
    public void area(){
        int tmp=(side1+side2+side3)/2;
        int t2=tmp*(tmp-side1)*(tmp-side2)*(tmp-side3);
        double area=Math.sqrt(t2);

        // int pro=side1*side2;
        // float area=(float)pro/2;
        System.out.println("Area is : "+area );
    }
    public void perimeter(){
       int sum=(side1+side2+side3);
       System.out.println("Perimeter : "+sum);
    }

}

public class Problem4 {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        Triangle t=new Triangle(a,b,c);
        t.area();
        t.perimeter();
    }
}
