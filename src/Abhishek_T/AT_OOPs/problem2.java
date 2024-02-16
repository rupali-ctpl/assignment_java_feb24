import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Student s = new Student("abhishek", 2);
        System.out.println("name is "+s.name+" and roll_no is "+s.roll_no);
    }
}

class Student{
    String name;
    int roll_no;
    Student(String s,int roll){
        name = s;
        roll_no =roll;

    }
}
