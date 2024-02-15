import java.util.*;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("greatest is "+a);
        }
        else {
            System.out.println("greatest is "+b);
        }
    }
}
