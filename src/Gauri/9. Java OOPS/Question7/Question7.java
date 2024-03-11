import java.util.*;
// class to create a complex number
class ComplexNumber {
    // declaring data members
    public double real, imaginary;

    // constructor which takes two double as parameters
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // method to print the complex number
    public void printComplexNumber() {
        System.out.println(real + "+" + imaginary + "i");
    }
}

// class to perform addition, subtraction, and multiplication of two complex numbers
class Complex {
    // declaring data members- two objects of ComplexNumber class
    ComplexNumber c1, c2;
    // constructor which takes two ComplexNumber objects as parameters
    public Complex(ComplexNumber c1, ComplexNumber c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    // method which performs the addition of two ComplexNumber objects and return the result as a ComplexNumber
    public ComplexNumber getSum() {
        ComplexNumber c = new ComplexNumber(0, 0);
        c.real = c1.real + c2.real;
        c.imaginary = c1.imaginary + c2.imaginary;
        return c;
    }
    
    // method which performs the subtraction of two ComplexNumber objects and return the result as a ComplexNumber
    public ComplexNumber getDifference() {
        ComplexNumber c = new ComplexNumber(0, 0);
        c.real = c1.real - c2.real;
        c.imaginary = c1.imaginary - c2.imaginary;
        return c;
    }
    
    // method which performs the multiplication of two ComplexNumber objects and return the result as a ComplexNumber
    public ComplexNumber getProduct() {
        ComplexNumber c = new ComplexNumber(0, 0);
        c.real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
        c.imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
        return c;
    }
}

public class Question7 {
    public static void main(String[] args) {
        // taking input of 4 double 
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        sc.close();
        // creating two complex numbers using parameterized constructor of class ComplexNumber
        ComplexNumber c1 = new ComplexNumber(a, b);
        ComplexNumber c2 = new ComplexNumber(c, d);
        // ComplexNumber c1 = new ComplexNumber(3, 4);
        // ComplexNumber c2 = new ComplexNumber(4, 7);
        // instantiating the object of Complex class using parameterized constructor
        Complex com = new Complex(c1, c2);
        // printing addition of 2 complex numbers
        com.getSum().printComplexNumber();
        // printing subtraction of 2 complex numbers
        com.getProduct().printComplexNumber();
        // printing multiplication of 2 complex numbers
        com.getDifference().printComplexNumber();
    }
}
