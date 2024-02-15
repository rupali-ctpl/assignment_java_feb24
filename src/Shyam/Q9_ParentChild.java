public class Q9_ParentChild {

    public static class Parent {
        void ParentMethod() {
            System.out.println("This is Parent Class");
        }
    }

    public static class Child extends Parent {
        void ChildMethod() {
            System.out.println("This is Child Class");
        }
    }

    public static void main(String[] args) {

        Parent p1 = new Parent();

        p1.ParentMethod();

        Child c1 = new Child();

        c1.ChildMethod();

        c1.ParentMethod();

    }

}
