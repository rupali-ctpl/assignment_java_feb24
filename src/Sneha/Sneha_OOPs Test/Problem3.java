class Triangle{
    int s1,s2,s3;

    void triangle(){
        
    }
    public void setSide(int s1,int s2,int s3){
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
public class Problem3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setSide(3, 4, 5);
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
        
    }
}
