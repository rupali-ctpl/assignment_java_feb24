package oops;
class student{
  String name;
  int roll_no;

  public student(String name , int roll_no){
    this.name = name;
    this.roll_no = roll_no;
  }
  public void print(){
    System.out.println("Name : "+name+"  roll_no :  "+roll_no);
  }
}
public class que2 {
  public static void main(String[] args) {
    student s = new student("Mohini", 107);
    s.print();
  
}
}
