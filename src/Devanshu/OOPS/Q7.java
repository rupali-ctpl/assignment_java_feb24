import java.util.Scanner;
// Class to represent complex numbers and perform operations.
class Complex {
    public int real;
    public int imaginary;
    // Constructor to initialize complex numbers.
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // calculate sum of two complex numbers.
    public void sum(Complex c2) {
        int sumReal = this.real + c2.real;
        int sumImaginary = this.imaginary + c2.imaginary;
        System.out.println("Sum is "+sumReal + " + " + sumImaginary + "i");
    }
    // calculate difference of two complex numbers.
    public void difference(Complex c2) {
        int diffReal = this.real - c2.real;
        int diffImaginary = this.imaginary - c2.imaginary;
        System.out.println("difference is "+diffReal + " + " + diffImaginary + "i");
    }
    // calculate product of two complex numbers.
    public void product(Complex c2) {
        int realPart = this.real * c2.real-this.imaginary * c2.imaginary;;
        int imaginaryPart = this.real * c2.imaginary + this.imaginary * c2.real;   

        System.out.println("Product is "+realPart + " + " + imaginaryPart + "i");
    }
}
// Main class 
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter real value of the 1st complex number: ");
        int real1 = sc.nextInt();
        System.out.print("Enter imaginary value of the 1st complex number: ");
        int imaginary1 = sc.nextInt();
        Complex complex1 = new Complex(real1, imaginary1);

        // Input for the second complex number
        System.out.print("Enter real value of the 2nd complex number: ");
        int real2 = sc.nextInt();
        System.out.print("Enter imaginary value of the 2nd complex number: ");
        int imaginary2 = sc.nextInt();
        Complex complex2 = new Complex(real2, imaginary2);

        // Display results
        complex1.sum(complex2);
        complex1.difference(complex2);
        complex1.product(complex2);

        sc.close();
    }
}
