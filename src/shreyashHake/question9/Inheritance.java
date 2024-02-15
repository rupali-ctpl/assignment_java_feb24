package shreyashHake.question9;

class Parent {

    public void parentInfo() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    public void childInfo() {
        System.out.println("This is child class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent instanceOfParent = new Parent();
        Child instanceOfChild = new Child();

        // 1
        instanceOfParent.parentInfo();

        // 2
        instanceOfChild.childInfo();

        // 3
        instanceOfChild.parentInfo();
    }
}
