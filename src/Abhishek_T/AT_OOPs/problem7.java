import java.util.*;
public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        String img1 = sc.next();
        int real2 = sc.nextInt();
        String img2 = sc.next();
        Complex c = new Complex(4, "1i", 5, "4j");
    }
}

class Complex{
      int real1;
      String img1;
      int real2;
      String img2;
      int ireal1 =0;
     int ireal2=0;
     int x=0;
     int y=0;
      Complex(int real1,String img1,int real2,String img2){
        this.real1 = real1;
        this.img1 = img1;
        this.real2 = real2;
        this.img2 = img2;
      }

      while(x<img1.length() ){
        if((img1.charAt(x)>='0') && (img1.charAt(x)<='9'))
        {
            ireal1=ireal1*10+Integer.valueOf(img1.charAt(x));
        x++;
        }
        else{
            break;
        }
      }
      while(y<img2.length() ){
        if((img2.charAt(y)>='0') && (img2.charAt(y)<='9'))
       {
        ireal2=ireal2*10+Integer.valueOf(img2.charAt(y));
        y++;
       }
       else{
        break;
       }
      }


      String sum(){
         int rsum=0;
         String isum;
         rsum = real1+real2;
         
         if(img1.equals(img2)){
             rsum = rsum+2*ireal1;
             isum =img1.substring(x);
         }
         else{
            isum = img1+img2;
         }
         return rsum+isum;
      }

      String diff(){
        int rdiff;
        String idiff;
        rdiff = real1-real2;
        if(img1.equals(img2)){
            
            idiff="";
        }
        else{
            idiff =img1+"-"+img2;
        }
        
        return rdiff+idiff;
      }

      String prod(){
        int rprod;
        String iprod;
        rprod = real1*real2;
        if(img1.equals(img2)){
             rprod =rprod*ireal1*ireal1;
        }
        else{
            iprod = img1.substring(x);
        }
        return rprod+iprod;
      }
}
