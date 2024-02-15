import java.util.Scanner;

public class quit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  numbers && press 'q' to quit ");
        double sum = 0;
        int mul = 1;
        int cnt = 0;
        while(true)
        {
            String str = sc.next();
            if(str.equals("q")) break;
            int n = Integer.parseInt(str);
            sum += n;
            mul *= n;
            cnt++;
        }
        System.out.println("Avg is " + sum/cnt);
        System.out.println("Prduct is " + mul);
        sc.close();
        
    }
}
