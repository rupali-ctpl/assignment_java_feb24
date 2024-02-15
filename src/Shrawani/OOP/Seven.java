package Shrawani.OOP;


//class Complex {
//    private int real;
//    private int img;
//
//    Complex(int real, int img) {
//        this.real = real;
//        this.img = img;
//    }
//
//    void PrintSum(Complex a, Complex b) {
//        int real_ans = a.real + b.real;
//        int imaginary_ans = a.img + b.img;
//        System.out.println("The sum is: " + real_ans + " + " + imaginary_ans + "i ");
//    }
//
//}
class Complex {
    private int real1, real2;
    private int img1, img2;

    Complex(int real1, int img1, int real2, int img2) {
        this.real1 = real1;
        this.real2 = real2;
        this.img1 = img1;
        this.img2 = img2;
    }

    void addition() {
        int res_i = img1 + img2;
        int res_r = real1 + real2;
        System.out.println("Addition is: " + res_r + (res_i > 0 ? "+" + res_i : res_i) + "i");
    }

    void difference() {
        int res_i = img1 - img2;
        int res_r = real1 - real2;
        System.out.println("Addition is: " + res_r + (res_i > 0 ? "+" + res_i : res_i) + "i");
    }

    void multiplication() {
        System.out.println("OOps! Unable to recall the formulae.");
    }
}

public class Seven {
    public static void main(String[] args) {
        Complex c = new Complex(10, 5, -2, -6);
        c.addition();
        c.difference();
        c.multiplication();
    }
}
