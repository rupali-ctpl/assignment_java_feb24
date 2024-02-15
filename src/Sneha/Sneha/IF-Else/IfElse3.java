import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        
        int m = sc.nextInt();

        if(m>80){
            System.out.println("Grade A");
        }
        else if(m>=60 && m<=80){
            System.out.println("Grade B");
        }
        else if(m>=50 && m<60){
            System.out.println("Grade C");
        }
        else if(m>=45 && m<50){
            System.out.println("Grade D");
        }
        else if(m>=25 && m<45){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
