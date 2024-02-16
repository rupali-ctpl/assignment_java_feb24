class Parenting{
    public Parenting(){

    }
    public void m1(){
        System.out.println("This is parent class");
    }
   
}

class Childish extends Parenting{
    public Childish(){

    }
    public void m2(){
        System.out.println("This is child class");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        Parenting p1 = new Parenting();
        p1.m1();
        Childish c1 = new Childish();
        c1.m2();
        c1.m1();
        
    }
}
