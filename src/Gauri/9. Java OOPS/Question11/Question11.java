// class shape - super class of Circle and Rectangle class
class Shape {
    // display method of Shape class
    public void display() {
        System.out.println("This is shape");
    }
}

// Rectangle class - extends from Shape class
class Rectangle extends Shape {
    // display method of Rectangle class - overriding the dispaly method of Shape class
    public void display() {
        System.out.println("This is rectangular shape");
    }
}

// Circle class - extends from Shape class
class Circle extends Shape {
    // display method of Circle class - overriding the dispaly method of Shape class
    public void display() {
        System.out.println("This is circular shape");
    }
}

public class Question11 {
    public static void main(String[] args) {
        // instantiating the object of Rectangle class
        Rectangle r = new Rectangle();
        // instantiating the object of Circle class
        Circle c = new Circle();
        // calling display method of Rectangle class 
        r.display();
        // calling display method of Circle class 
        c.display();
    }
}
