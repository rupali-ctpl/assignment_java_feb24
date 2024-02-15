package shreyashHake.question7;

import java.util.Scanner;

public class Complex {
    public int real;
    public int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

class Calculations {
    public Complex getSum(Complex num1, Complex num2) {
        return new Complex((num1.real + num2.real), (num1.imaginary + num2.imaginary));
    }

    public Complex getDifference(Complex num1, Complex num2) {
        return new Complex((num1.real - num2.real), (num1.imaginary - num2.imaginary));
    }

    public Complex getProduct(Complex num1, Complex num2) {
        /** Derived by
         * num1 : A + Bi
         * num2: C + Di
         *
         * (A + Bi) * (C + Di)
         * (AC + ABi + BCi - BD)
         * (AC - BD) + B(A + C)i
         * */

        return new Complex(
                (num1.real*num2.real - num1.imaginary* num2.imaginary),
                (num1.imaginary*(num1.real + num2.real))
        );
    }

    public static String getFormatted(Complex num) {
        return String.format("%d + %di", num.real, num.imaginary);
    }

    public static void printResult(Complex num1, Complex num2, Complex num3, String operation) {
        System.out.println(operation + " of " + getFormatted(num1) + " and " + getFormatted(num2) + " is " + getFormatted(num3));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Complex number
        System.out.print("Enter real value of first Complex number : ");
        int real = sc.nextInt();
        System.out.print("Enter imaginary value of first Complex number : ");
        int imaginary = sc.nextInt();

        Complex num1 = new Complex(real, imaginary);

        // Second Complex number
        System.out.print("Enter real value of second Complex number : ");
        int realSec = sc.nextInt();
        System.out.print("Enter imaginary value of second Complex number : ");
        int imaginarySec = sc.nextInt();

        Complex num2 = new Complex(realSec, imaginarySec);

        System.out.println();
        Calculations instance = new Calculations();

        Complex sum = instance.getSum(num1, num2);
        printResult(num1, num2, sum, "Sum");

        Complex difference = instance.getDifference(num1, num2);
        printResult(num1, num2, difference, "Difference");

        Complex product = instance.getProduct(num1, num2);
        printResult(num1, num2, product, "Product");
    }
}
