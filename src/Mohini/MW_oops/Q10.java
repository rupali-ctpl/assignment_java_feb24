// Member class having properties name,age,phone number,address,salary
class Member {
  public String Name;
  public int Age;
  public String Phone_Number;
  public String Address;
  public int Salary;

  // consturctor to initialize proprties of member class
  public Member(String Name, int Age, String Phone_Number, String Address, int Salary) {
    this.Name = Name;
    this.Age = Age;
    this.Phone_Number = Phone_Number;
    this.Address = Address;
    this.Salary = Salary;
  }

  // mathod to print details
  public void printDetails() {
    System.out.println("Name: " + Name + " Age: " + Age + " Phone_Number: " + Phone_Number + " Address: " + Address
        + " Salary: " + Salary);
  }

  // method to print salary
  public void printSalary() {
    System.out.println("Salary of member is " + Salary);
  }

}

// Employee class extending from member class
class Employee extends Member {
  public String specialization;

  // constryctor to initialize proprties of employee class
  public Employee(String Name, int Age, String Phone_Number, String Address, int Salary, String specialization) {
    super(Name, Age, Phone_Number, Address, Salary);
    this.specialization = specialization;

  }
}

// Manager class extending from member class
class Manager extends Member {
  public String Department;

  // constryctor to initialize proprties of Manager class
  public Manager(String Name, int Age, String Phone_Number, String Address, int Salary, String Department) {
    super(Name, Age, Phone_Number, Address, Salary);
    this.Department = Department;

  }
}

public class Q10 {
  public static void main(String[] args) {
    Manager M = new Manager("Manoj", 34, "3254768710", "Balewadi , Pune", 32000, "IT");
    Employee E = new Employee("Arun", 30, "3234287102", "Viman Nagar, Pune", 35000, "marketing");
    M.printDetails();
    E.printDetails();
  }

}
