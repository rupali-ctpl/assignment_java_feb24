public class Oper5 {
    public static void main(String[] args) {
        int a =6;
        int b =8;
        System.out.println("a= "+a+" b= "+b);

        // Using third variable
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a+" b= "+b);

        // Without using third variable

        a=6;
        b=8;

        
        a=b-a;
        b=b-a;
        a=a+b;
 
        System.out.println("a= "+a+" b= "+b);

    }
}
