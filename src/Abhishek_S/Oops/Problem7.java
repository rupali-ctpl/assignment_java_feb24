import java.util.Scanner;

class Complex{
    public void calculateSum(int r1,int i1,int r2,int i2){
         int r=r1+r2;
         int i=i1+i2;

         System.out.println("Sum is : ");
         System.out.println("Real : "+r);
         System.out.println("Imaginary : "+i);
    }

    public void calculateDiff(int r1,int i1,int r2,int i2){
        int r=r1-r2;
        int i=i1-i2;

        System.out.println("Difference is : ");
        System.out.println("Real : "+r);
        System.out.println("Imaginary : "+i);
    }

    public void calculateProduct(int r1,int i1,int r2,int i2 ){
        int r=r1*r2-(i1*i2);
        int i=(r1*i2)+(r2*i1);

        System.out.println("Product is : ");
        System.out.println("Real : "+r);
        System.out.println("Imaginary : "+i);
    }

}

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part and imaginary part : ");
        int real1=sc.nextInt();
        int imag1=sc.nextInt();
        System.out.println();

        System.out.print("Enter real part and imaginary part : ");
        int real2=sc.nextInt();
        int imag2=sc.nextInt();
        System.out.println();

        Complex c=new Complex();
        c.calculateSum(real1,imag1,real2,imag2);
        System.out.println();
        c.calculateDiff(real1,imag1,real2,imag2);
        System.out.println();
        c.calculateProduct(real1,imag1,real2,imag2);
    }
}
