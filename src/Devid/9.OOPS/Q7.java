import java.util.Scanner;

class Complex {
    // Variable to store the real and imaginary values of complex number
    public double real;
    public double imaginary;
    // Constructor with parameter to initialize real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    // Method to substract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newRealPart = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newRealPart, newImaginaryPart);
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Taking inputs from user
        Scanner sc = new Scanner(System.in);
        // Getting real and imaginary part of first complex number
        System.out.println("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter imaginary part of first complex number: ");
        double imaginary1 = sc.nextDouble();
        // Getting real and imaginary part of first complex number
        System.out.println("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.println("Enter imaginary part of second complex number: ");
        double imaginary2 = sc.nextDouble();
        // Creating the objects
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);
        // Calculating the values
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        // Printing the result
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
        System.out.println("Product: " + product.real + " + " + product.imaginary + "i");
    }
}
