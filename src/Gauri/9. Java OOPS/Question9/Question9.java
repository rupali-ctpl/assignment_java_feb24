// Parent class - super class of Child class
class Parent {
    // display method of Parent class
    public void parentDisplay() {
        System.out.println("This is parent class");
    }
}
// Child class - extends from Parent class
class Child extends Parent {
    // display method of Child class
    public void childDisplay() {
        System.out.println("This is child class");
    }
}

public class Question9 {
    public static void main(String[] args) {
        // instantiating the object of Parent class
        Parent p = new Parent();
        // instantiating the object of Child class
        Child c = new Child();
        // calling display method of Parent class using instance of Parent class
        p.parentDisplay();
        // calling display method of Child class using instance of Child class
        c.childDisplay();
        // calling display method of Parent class using instance of Child class
        c.parentDisplay();

    }
}
