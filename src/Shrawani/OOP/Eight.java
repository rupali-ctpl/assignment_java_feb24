package Shrawani.OOP;

class Student1{
    private String name;
    Student1(){
        this.name="Unknown";
    }
    Student1(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}
public class Eight {
    public static void main(String[] args) {
        Student1 s= new Student1();
        Student1 s2= new Student1("Shravni");
        s.display();
        s2.display();
    }
}
