class Student{
  String name;
  // non-parametrized constructor 
  Student(){
    System.out.println("Unknown");
  }
  //parametrized constructor 
  Student(String name){
      this.name=name;
  }
  // function to display names
  public String getName(){
      return name;
  }
}
public class Problem8 {
  public static void main(String[] args){
    // creating object by passing values
    Student s1 = new Student("Sneha");
    Student s2 = new Student("nikita");
    // // craeting object by not passing values
    // Student s3 = new Student();
    // calling the function to get the name.
    System.out.println(s1.getName());
    System.out.println(s2.getName());
  }
}
