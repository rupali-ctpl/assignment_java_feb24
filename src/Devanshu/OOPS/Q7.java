import java.util.Scanner;

class Complex{

    public void add(int r1,int i1,int r2,int i2){
        System.out.println("Addition is "+(r1+r2)+"+"+(i1+i2)+"i");
    }

    public void Sub(int r1,int i1,int r2,int i2){
        System.out.println("Substraction is "+(r1-r2)+"+"+(i1-i2)+"i");
    }

    public void prod(int r1,int i1,int r2,int i2){
        System.out.println("Product is "+(r1*r2)+"+"+(i1*i2)+"i");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Complex c=new Complex();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first number:");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("Enter real and imaginary part of second number:");
        int r2=sc.nextInt();
        int i2=sc.nextInt();

        c.add(r1, i1, r2, i2);
        c.Sub(r1, i1, r2, i2);
        c.prod(r1, i1, r2, i2);
    }
}
