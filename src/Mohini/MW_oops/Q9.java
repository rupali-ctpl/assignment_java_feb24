//perent class having method print
class parent {
  public void print() {
    System.out.println("This is parent class");
  }
}

// child class extending from parent class
class child extends parent {
  public void print1() {
    System.out.println("This is child class");
  }
}

public class Q9 {
  public static void main(String[] args) {
    parent p = new parent();
    child c1 = new child();

    p.print();
    c1.print1();
    c1.print();
  }

}
