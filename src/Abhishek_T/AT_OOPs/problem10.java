public class problem10 {
    public static void main(String[] args) {
        // employee obj
         Employee e = new Employee("abhi", 21, "9999","Balewadi",10000,"intern");

         // manager obj
         Manager m = new Manager("abhishek", 22, "999", "Balewadi", 2220, "ceo");

         e.display();
         e.printSalary();
         System.out.println();
         m.display();
         m.printSalary();

    }
}

// Member class storing all the info and printsalary method
class Member{
    String name;
    int age;
    String ph_no;
    String Address;
    double salary;

    // member class constructor for initializing
    Member(String name,int age,String ph_no,String Address,double salary){
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;
        this.Address = Address;
        this.salary = salary;
    }

    // method to print the salary
    void printSalary(){
        System.out.println("salary is "+salary);
    }
}

// employee class extending the member class and containing specialization with display method
class Employee extends Member{
    String specialization;
    // constructor to initialize and calling parent by super
   Employee(String name,int age,String ph_no,String Address,double salary,String specialization)
   {
     super(name,age,ph_no,Address,salary);
     this.specialization = specialization;
   }

   void display(){
    System.out.println("Employee details:");
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Phone no:"+ph_no);
    System.out.println("Address:"+Address);
    System.out.println("Salary:"+salary);
   }

}

// manager class extending the member class containing department and display method
class Manager extends Member{
    String department;
    // constructor to initialize and calling parent by super
    Manager(String name,int age,String ph_no,String Address,double salary,String department)
    {
      super(name,age,ph_no,Address,salary);
      this.department=department;
    }
 
    void display(){
     System.out.println("Manager details:");
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("Phone no:"+ph_no);
     System.out.println("Address:"+Address);
     System.out.println("Salary:"+salary);
    }
}