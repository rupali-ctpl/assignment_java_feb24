import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Student s = new Student("abhishek", 2);
        String name = s.getName();
        int roll_no = s.getRno();
        System.out.println("name is "+name+" and roll_no is "+roll_no);
    }
}

// Student class for storing Student info 
class Student{
    private String name;
    private int roll_no;

    // constructor for initializing
    Student(String s,int roll){
        name = s;
        roll_no =roll;

    }
   
    // getter method to return name
    String getName(){
        return name;
    }

    // getter method to return roll_no 
    int getRno(){
        return roll_no;
    }
}
