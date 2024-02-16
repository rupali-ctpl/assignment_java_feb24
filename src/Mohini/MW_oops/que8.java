package oops;
import java.util.Scanner;

class student{
public String name;

public student(String name){
  this.name = name;
}
public void print(){
  if(name == ""){
    System.out.println("student name is Unknown");
  }
  else{
    System.out.println("student name is " +name);
  }
}
}
public class que8{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String ss = sc.nextLine();
    student s = new student(ss);
    s.print();
    student s1 = new student("");
    s1.print();
  }
}
