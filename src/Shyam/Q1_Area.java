import java.util.Scanner;

public class Q1_Area {

    public static int setDim(int length, int breadth) {

        return getArea(length, breadth);

    }

    public static int getArea(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int breadth = sc.nextInt();

        int result = setDim(length, breadth);

        System.out.println(result);

    }

}
