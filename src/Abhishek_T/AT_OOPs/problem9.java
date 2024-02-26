public class problem9 {
    public static void main(String[] args) {
        
        //1- meth of parent class by obj of parent class
        parent obj1 = new parent();
        obj1.meth1();

        //2- meth of child class by obj of child class
        child obj2 = new child();
        obj2.meth2();

        //3-meth of parent class by obj of child class
        child obj3 = new child();
        obj3.meth1();
    }
}

// parent class with its method
class parent{
    void meth1(){
        System.out.println("This is parent class");
    }
}

// child class extending the parent class 
class child extends parent{
    void meth2(){
        System.out.println("this is child class");
    }
}
