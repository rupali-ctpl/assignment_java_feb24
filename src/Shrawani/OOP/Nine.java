package Shrawani.OOP;

//Parent
class parent {
    void meth1() {
        System.out.println("This is a parent class.");
    }
}

// Child
class child extends parent {

    void meth2() {
        System.out.println("This is a child class. ");
    }

}

public class Nine {
    public static void main(String[] args) {

        //Instance of parent class
        parent p = new parent();

        //Instance of child class
        child c = new child();

        // Call meth1() from Parent class
        p.meth1();

        // Call meth2() from Child class
        c.meth2();

        // Call meth1() from Child class
        c.meth1();


    }
}
