import java.util.Scanner;

class Area{
public int l;
public int b;

  public  void setDim(int l,int b){
    this.l=l;
    this.b =b;
}

public  int getArea(){
   return l*b;
}
}
public class Problem1{
    public static void main(String[] args){

        Area a = new Area();

         Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        a.setDim(l, b);
        
        System.out.println(a.getArea());
        
    }

}