class Student{
    String name;
    int roll_no;

    public Student(String name,int roll_no){
      this.name=name;
      this.roll_no=roll_no;
    }
    public String toString(){
        return "name: "+name+" and roll no "+roll_no;
    }
    

}
public class Problem2 {
    public static void main(String[] args){
        Student s = new Student("John",2);
        System.out.println(s.toString());


        
        
    }
}
