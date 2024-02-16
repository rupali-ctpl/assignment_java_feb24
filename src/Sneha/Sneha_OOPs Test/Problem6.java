import java.util.*;

class Areaa{
    
    int l;
    int b;
   
    

    Areaa(int l,int b){
        this.l =l;
        this.b=b;

    }
     public int returnArea(){
        return l*b;
     }

}
public class Problem6 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
    
       Areaa a = new Areaa(l,b);
       System.out.println(a.returnArea());
       


        sc.close();
    }
}
