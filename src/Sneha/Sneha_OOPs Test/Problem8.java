class Student3{

    String name;

    Student3(){
      System.out.println("Unknown");
    }
  
    Student3(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
public class Problem8 {
    public static void main(String[] args){
      Student3 s1 = new Student3("Sneha");
      Student3 s2 = new Student3("nikita");
      Student3 s3 = new Student3();

    
      System.out.println(s1.getName());
      System.out.println(s2.getName());
      
     
      
      
    
    }
}
