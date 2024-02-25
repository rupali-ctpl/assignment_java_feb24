//Student class having properties name and rollno
class Student {
  String name;
  int roll_no;

  // constuctor for intializing name and roll no
  public Student(String name, int roll_no) {
    this.name = name;
    this.roll_no = roll_no;
  }

  // print method to print name and roolno of student
  public void print() {
    System.out.println("Name : " + name + "  roll_no :  " + roll_no);
  }
}

public class Q2 {
  public static void main(String[] args) {
    Student s = new Student("John", 2);
    s.print();

  }
}
