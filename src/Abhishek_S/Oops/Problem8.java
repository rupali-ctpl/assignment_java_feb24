
class Student{
    String name="Unknown";

    Student(){

    }
    Student(String name){
       this.name=name;
    }
}

public class Problem8 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Abhishek");

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
