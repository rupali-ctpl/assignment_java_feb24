public class Q2_Student {

    String name;

    int roll_no;

    Q2_Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {

        Q2_Student s1 = new Q2_Student("Shyam", 101);

        System.out.println(s1.name);
        System.out.println(s1.roll_no);

    }

}
