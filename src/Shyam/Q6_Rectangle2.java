public class Q6_Rectangle2 {

    public static class Area {

        int length;
        int breadth;

        Area(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;

        }

        int returnArea() {
            return length * breadth;
        }

    }

    public static void main(String[] args) {

        Area A1 = new Area(3, 4);

        System.out.println(A1.returnArea());

    }

}
