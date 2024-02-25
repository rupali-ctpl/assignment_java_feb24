package Shrawani.OOP;


class Complex {
    double real;
    double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Subtraction
    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Multiplication
    public Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }

    // print complex number
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}

public class Seven {
    public static void main(String[] args) {
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(1, 4);

        // Sum
        Complex sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Difference
        Complex diff = num1.subtract(num2);
        System.out.println("Difference: " + diff);

        // Multiplication
        Complex Multiplication = num1.multiply(num2);
        System.out.println("Product: " + Multiplication);
    }
}

