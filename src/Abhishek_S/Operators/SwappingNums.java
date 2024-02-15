
public class SwappingNums {
    public static void main(String[] args) {
        int a=6,b=8;
        
        System.out.println(a+" "+b);
        // first way using 3rd variable
        int c=b;
        b=a;a=c;
     
        System.out.println(a+" "+b);
        // Second way without third variable 
        a = a^b;
        b=b^a;
        a=a^b;

        System.out.println(a+" "+b);
    }
}
