package Shrawani.OOP;

import javax.xml.namespace.QName;

class Student{
    private String name;
    private int roll_number;

     public Student(String name, int roll_number){
        this.name= name;
        this.roll_number= roll_number;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ roll_number);
    }
}
public class Two {
    public static void main(String[] args) {
        Student s= new  Student("John", 2);
        s.display();

    }
}
