import java.util.Scanner;

// class for adding,subtracting and multiplying two complex numbers
 class Complex {
    // Method to add two complex numbers
    public static void add(double real1, double imaginary1, double real2, double imaginary2) {
        double sumReal = real1 + real2;
        double sumImaginary = imaginary1 + imaginary2;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }

    // Method to subtract two complex numbers
    public static void subtract(double real1, double imaginary1, double real2, double imaginary2) {
        double diffReal = real1 - real2;
        double diffImaginary = imaginary1 - imaginary2;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }

    // Method to multiply two complex numbers
    public static void multiply(double real1, double imaginary1, double real2, double imaginary2) {
        double productReal = real1 * real2 - imaginary1 * imaginary2;
        double productImaginary = real1 * imaginary2 + imaginary1 * real2;
        System.out.println("Product: " + productReal + " + " + productImaginary + "i");
    }

    
}

public class problem7{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input for the first complex number
    System.out.println("Enter the real part of the first complex number:");
    double real1 = scanner.nextDouble();
    System.out.println("Enter the imaginary part of the first complex number:");
    double imaginary1 = scanner.nextDouble();

    // Input for the second complex number
    System.out.println("Enter the real part of the second complex number:");
    double real2 = scanner.nextDouble();
    System.out.println("Enter the imaginary part of the second complex number:");
    double imaginary2 = scanner.nextDouble();
    
     

    // Calculating and displaying results
    Complex.add(real1, imaginary1, real2, imaginary2);
    Complex.subtract(real1, imaginary1, real2, imaginary2);
    Complex.multiply(real1, imaginary1, real2, imaginary2);

    
}
}
