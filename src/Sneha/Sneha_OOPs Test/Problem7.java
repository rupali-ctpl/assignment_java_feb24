import java.util.Scanner;
//class for complex number
class Complex{
    public int real;
    public int img;
    //constructor of complex class 
    Complex(int real1, int imaginary1)
    {
        real = real1;
        img = imaginary1;
    }
    // function to calculate sum of complex number
    public void sum( Complex c2)
    {
        int re = this.real + c2.real;
        int im = this.img + c2.img;
        System.out.println(re +" + "+"i"+im);
    }
    // function to calculate difference of complex number
    public void difference(Complex c2)
    {
        int re = this.real - c2.real;
        int im = this.img - c2.img;
        if(im <0) System.out.println(re +" + ("+im+")i");
        else System.out.println(re +" + "+"i"+im);
    }
    // function to calcalute product of complex number
    public void product( Complex c2)
    {
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
        // Enter the number from user
        System.out.print("Enter real and imaginary value of 1st complex number ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        Complex complex1 = new Complex(first,second);
        System.out.print("Enter real and imaginary value of 2nd complex number ");
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        Complex complex2 = new Complex(third,fourth);
        complex1.sum(complex2);
        complex1.difference(complex2);
        complex1.product(complex2);
        sc.close();
    }
}