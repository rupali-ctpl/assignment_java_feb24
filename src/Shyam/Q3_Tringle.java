public class Q3_Tringle {

    int a = 3;
    int b = 4;
    int c = 5;

    int area() {
        return a * b * c;
    }

    int perimeter() {
        return a + b + c;
    }

    public static void main(String[] args) {

        Q3_Tringle t1 = new Q3_Tringle();

        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }
}
