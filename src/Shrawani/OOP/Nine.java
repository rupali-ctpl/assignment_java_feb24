package Shrawani.OOP;

class parent{
    void meth1(){
        System.out.println("This is a parent class.");
    }
}
class child extends parent{

    void meth2(){
        System.out.println("This is a child class. ");
    }

}
public class Nine {
    public static void main(String[] args) {
        parent p= new parent();
        child c =new child();
        p.meth1();
        c.meth2();
        c.meth1();


    }
}
