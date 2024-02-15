class Super{
    public void prints(){
        System.out.println("This is parent class");
    }
}
class sub extends Super{
    public void prints(){
        // super.prints();
        System.out.println("This is child class");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        Super s = new Super();
        s.prints();
        sub sb = new sub();
        sb.prints();

        Super s2 = new sub();
        s2.prints();
    }
}
