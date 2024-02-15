public class swapping2 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        // swap using variable
        System.out.println("Swaping with variable ");
        System.out.println("Before swapping " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping " + a + " " + b);

        System.out.println("Swaping without variable ");
        System.out.println("Before swapping " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swaping " + a + " " + b);

    }
}
