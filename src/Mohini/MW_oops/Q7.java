class Complex{
  public double real ;
  public double imaginary;

  //constructor to initialize real and imaginary 
  public Complex(double real , double imaginary ){
    this.real = real;
    this.imaginary = imaginary;
  }

  //sum method
  public Complex sum(Complex other) {
    double r =  this.real + other.real;
    double i =   this.imaginary + other.imaginary;
    return new Complex(r, i);
}
//difference method
public Complex difference(Complex other) {
  double r =  this.real - other.real;
  double i =   this.imaginary - other.imaginary;
 return new Complex(r, i);
}

//product method
public Complex product(Complex other) {
  double r = this.real * other.real - this.imaginary * other.imaginary;
  double i = this.real * other.imaginary + this.imaginary * other.real;
  return new Complex(r, i);
}

public void display() {
  System.out.println(this.real + " + " + this.imaginary + "i");
}
}
  public class Q7 {
    public static void main(String[] args) {
      Complex c1 = new Complex(4, 5);
      Complex c2 = new Complex(6, 7);
      
      // Sum
      Complex add = c1.sum(c2);
      System.out.print("Sum: ");
      add.display();
  
      // Difference
      Complex sub = c1.difference(c2);
      System.out.print("Difference: ");
      sub.display();
  
      // Product
      Complex multiply = c1.product(c2);
      System.out.print("Product: ");
      multiply.display();
}
  }



      
  
    

  