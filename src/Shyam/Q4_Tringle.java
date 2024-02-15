public class Q4_Tringle {

    int a = 3;
    int b = 4;
    int c = 5;

    Q4_Tringle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    int area() {
        return a * b * c;
    }

    int perimeter() {
        return a + b + c;
    }

    public static void main(String[] args) {

        Q4_Tringle tc1 = new Q4_Tringle(3, 4, 5);

        System.out.println(tc1.area());

        System.out.println(tc1.perimeter());

    }

}
