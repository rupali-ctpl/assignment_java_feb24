 import java.util.*;

public class check_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of length and beradth ");
        double len = sc.nextDouble();
        double br = sc.nextDouble();
        if(len==br){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}
