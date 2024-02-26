/**
 * Parent class Super implementing ths prints method
 */
class Super{
    public void prints(){
        System.out.println("This is parent class");
    }
}
/**
 * Child class extends from the parent class(Super) and overrides the prints method.
 */
class sub extends Super{
    public void prints(){
        System.out.println("This is child class");
    }
}
public class Problem9 {
    public static void main(String[] args) {
        /**
         * Creating the object of parent class and calling parent class prints method
         */
        Super s = new Super();
        s.prints();
        /**
         * Creating the object of child class(sub) and calling child class prints method
         */
        sub sb = new sub();
        sb.prints();
        /**
         * Creating the object of child class having reference of the parent class and calling parent class prints method
         */
        Super s2 = new sub();
        s2.prints();
    }
}
