import java.util.Scanner;

//class students having property name
class student{
public String name;

//default constuctor to initilize name with unknown
public student(){
  this.name = "Unknown";

}
//constuctor to initilize name with given input
public student(String name){
  this.name = name;
}
//method to print student name
public void print(){
 System.out.println("student name is "+name);
}
}
public class Q8{
  public static void main(String[] args) {
    student s1 = new student("smith");
    student s2 = new student();
    s1.print();
    s2.print();
  }
}
