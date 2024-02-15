import java.util.Scanner;


class Complex{
    public int real;
    public int img;

    Complex(int r, int i){
        real = r;
        img = i;
    }
    public void sum( Complex c2)
    {
        int re = this.real + c2.real;
        int im = this.img + c2.img;
        System.out.println(re +" + "+im+"i");
    }
    public void difference(Complex c2)
    {
        int re = this.real - c2.real;
        int im = this.img - c2.img;
        if(im <0) System.out.println(re +" + ("+im+")i");
        else System.out.println(re +" + "+im+"i");
    }
    public void product( Complex c2)
    {
        // int re = c1.real + c2.real;
        //  c1.real*c2.real+ c1.real*c2.img + c1.imag*c2.real + c1.imag*c2.img
        int x = this.real*c2.real;
        int y = this.real*c2.img + this.img*c2.real;
        int z = this.img*c2.img;
        int re = x - z;
        System.out.println(re +" + "+y+"i");
    }

}

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary value of 1st complex number ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Complex c = new Complex(x,y);
        System.out.print("Enter real and imaginary value of 2nd complex number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Complex c2 = new Complex(a,b);
        

        c.sum(c2);
        c.difference(c2);
        c.product(c2);
        sc.close();
        
    }
}
