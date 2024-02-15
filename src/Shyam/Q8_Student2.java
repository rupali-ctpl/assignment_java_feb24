public class Q8_Student2 {

    String name1;
    String name2;

    Q8_Student2(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    Q8_Student2() {
        System.out.println("Unknown");
    }

    void printName() {
        System.out.println(name1 + " , " + name2);
    }

    public static void main(String[] args) {
        Q8_Student2 unknown = new Q8_Student2();
        Q8_Student2 students = new Q8_Student2("Shyam", "shreyash");

        students.printName();

    }

}
