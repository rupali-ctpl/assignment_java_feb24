
public class SumOfDigits {
    public static void main(String[] args) {
        int num=65432;
        String str=Integer.toString(num);

        int sum=(int)str.charAt(0)+(int)str.charAt(3)-(48*2);
        System.out.println("sum is : "+sum);
    }
}
