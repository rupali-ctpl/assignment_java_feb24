// import Parent.child;

class Parent{
    public String print(){
        return "This is parent class";
    }
}

class child extends Parent{
    public String print1(){
        return "This is child class";
    }
}

public class Q9 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        child obj1 = new child();

        System.out.println(obj.print());
        System.out.println(obj1.print1());
        System.out.println(obj1.print());

    }
}
