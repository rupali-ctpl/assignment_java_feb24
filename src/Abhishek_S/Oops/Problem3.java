
class  Triangle{
     public void area(int a,int b,int c){
         int tmp=(a+b+c)/2;
         int t2=tmp*(tmp-a)*(tmp-b)*(tmp-c);
         double area=Math.sqrt(t2);
         System.out.println("Area is : "+area );
     }
     public void perimeter(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Perimeter : "+sum);
     }

}
public class Problem3 {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        Triangle t=new Triangle();
        t.area(a, b, c);
        t.perimeter(a, b, c);
    }
}
