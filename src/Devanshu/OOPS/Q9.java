class Parent{
    public void meth1(){
        System.out.println("This is Parent class");
    }
}

class Child extends Parent{
    public void meth2(){
        System.out.println("This is Child class");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.meth1();

        Child c=new Child();
        c.meth2();

        c.meth1();
    }
}
