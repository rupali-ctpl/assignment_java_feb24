package oops;
class Member{
  public String Name;
  public int Age;
  public String Phone_Number;
  public String Address;
  public int Salary;

   public void printDetails(){
   System.out.println("Name: "+Name+" Age: "+Age+" Phone_Number: "+Phone_Number+" Address: "+Address+" Salary: " +Salary);
   }

  public void printSalary(){
    System.out.println("Salary of member is "+Salary);
  }


}

class Employee extends Member{
public String specialization;
public Employee(String Name,int Age ,String Phone_Number ,String Address,int Salary){
  this.Name= Name;
  this.Age =Age;
  this.Phone_Number = Phone_Number;
  this.Address = Address;
  this.Salary = Salary;
}
}
class Manager extends Member{
  public String Department;
  public Manager(String Name,int Age ,String Phone_Number ,String Address,int Salary){
    this.Name= Name;
    this.Age =Age;
    this.Phone_Number = Phone_Number;
    this.Address = Address;
    this.Salary = Salary;
  }

}

public class que10 {
  public static void main(String[] args) {
    Manager M =new Manager("Manoj", 34,"3254768710", "Balewadi , Pune", 32000);
    Employee E =new Employee("Arun", 30,"3234287102", "Viman Nagar, Pune", 35000);
    M.printDetails();
    E.printDetails();
  }
  
}
