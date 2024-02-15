class Student{
    public String name;
    public int roll_no ;
}

public class Q2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "John";
        obj.roll_no = 2;
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
    }
}
