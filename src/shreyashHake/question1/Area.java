package shreyashHake.question1;

import java.util.Scanner;

/** Question 1 */
public class Area {
    private long length;
    private long breadth;

    private void setDim(long length, long breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private long getArea() {
        return this.breadth * this.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area areaInstance = new Area();

        System.out.println("Enter length of rectangle: ");
        long inputLength = sc.nextLong();

        System.out.println("Enter breadth of rectangle: ");
        long inputBreadth = sc.nextLong();

        areaInstance.setDim(inputLength, inputBreadth);

        long result = areaInstance.getArea();
        System.out.println("Area of triangle: " + result);
    }
}
