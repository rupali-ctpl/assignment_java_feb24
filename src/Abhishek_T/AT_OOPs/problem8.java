import java.util.*;
public class problem8 {
    public static void main(String[] args) {
        Student st = new Student("abhi");
        String name = st.getName();
        System.out.println("Name of the student is "+name);
    }
}

// Student class for storing the name of the student
class Student{

    // parametrized constructor for giving our name
   private String name ;
    Student(String s){
           name =s;
    }

    // if no name is given this constructor will give unknown name
    Student(){
        name ="Unknown";
    }

    // getter method to return the name of the student
    String getName(){
        return name;
    }
}