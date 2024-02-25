//parent class
class Parent{
    // parent method
    public void parentmethod(){
        System.out.println("This is parent class");
    }
}
// child class extending from parent
class Child extends Parent{
    //child method
    public void childmethod(){
        System.out.println("This is child class");
    }
}
public class Problem9 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        //calling parent method
        parent1.parentmethod();
        Child child1 = new Child();
        //calling child method
        child1.childmethod();
        child1.parentmethod();   
    }
}
