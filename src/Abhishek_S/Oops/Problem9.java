
class Parent{
    public void display(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    public void display(){
        System.out.println("This is child class");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        // method of parent class and object of parent class
        Parent p=new Parent();
        p.display();

        // method of child class and object of child class
        Child c=new Child();
        c.display();

        // method of parent class and object of child class
        Parent pc=new Child();
        pc.display();
    }
}
