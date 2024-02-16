import java.util.*;
public class problem8 {
    public static void main(String[] args) {
        Student st = new Student("abhi");
        System.out.println("Name of the student is "+st.name);
    }
}

class Student{
    String name ;
    Student(String s){
           name =s;
    }
    Student(){
        name ="Unknown";
    }
}