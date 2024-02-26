import java.util.Scanner;
/**
 * Class representing the Complex equatinon containing the real and imaginary part of the quation && some operations on the complex equation.
 */
class Complex{
    private int real;
    private int img;
    /**
     * Setting the complex equation
     * @param r represent the real of the complex number
     * @param i represent the imaginary of the complex number
     */
    Complex(int r, int i){
        real = r;
        img = i;
    }
    /**
     *  Prints the sum of the two complex numbers
     * @param c2 represent the second complex number with whom sum operation is performed
     */
    public void sum( Complex c2)
    {
        int re = this.real + c2.real;
        int im = this.img + c2.img;
        System.out.println(re +" + "+im+"i");
    }
    /**
     * Prints the difference between two complex numbers
     * @param c2 represent the second complex number with whom substraction operation is performed
     */
    public void difference(Complex c2)
    {
        int re = this.real - c2.real;
        int im = this.img - c2.img;
        if(im <0) System.out.println(re +" + ("+im+")i");
        else System.out.println(re +" + "+im+"i");
    }
    /**
     * Prints the product of two complex numbers
     * @param c2 represent the second complex number with whom multiplication operation is performed
     */
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
        /**
         * Creating a first complex number.
         * Getting user input for real && imaginary parts of first complex number
         */
        System.out.print("Enter real and imaginary value of 1st complex number ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Complex c = new Complex(x,y);
         /**
         * Creating a second complex number.
         * Getting user input for real && imaginary parts of first complex number
         */
        System.out.print("Enter real and imaginary value of 2nd complex number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Complex c2 = new Complex(a,b);
        /**
         * Performing following operations on both of the complex numbers respectively.
         * First: sum
         * Second: Difference
         * Third: product
         */
        c.sum(c2);
        c.difference(c2);
        c.product(c2);
        sc.close();  
    }
}
