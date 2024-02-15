class Student{
    public String name;
    Student(){
        name = "Unknown";
    }
    Student(String na)
    {
        name = na;
    }
    public void display(){
        System.out.println(name);
    }
}
public class Problem8 {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.display();
        Student sc1 = new Student("Adhi");
        sc1.display();
    }
}
