
class Member{
    String Name;
    int Age;
    String PhoneNo;
    String Address;
    long salary;

    Member(String Name, int age, String PhoneNo, String Address,long salary){
         this.Name = Name;
         this.Age = age;
         this.PhoneNo = PhoneNo;
         this.Address = Address;
         this.salary=salary;
    }
    public void printSalary(){
        System.out.println("Salary :  "+salary);
    }
}

class Employee extends Member{
    String specialization;
    String department;

    Employee(String name, int age, String phone,String Address,String spec,String dept,long salary){
        super(name, age, phone, Address,salary);
        this.specialization =spec;
        this.department = dept;
    }
    public void display(){
        System.out.println("Employee Details : ");
        System.out.println("Name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Specialization : "+specialization);
        System.out.println("Department : "+department);
    }
}

class Manager extends Member{
    String specialization;
    String department;

    Manager(String name, int age, String phone,String Address,String spec,String dept,long salary){
        super(name, age, phone, Address,salary);
        this.specialization =spec;
        this.department = dept;
    }
    public void display(){
        System.out.println("Manager Details : ");
        System.out.println("Name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Specialization : "+specialization);
        System.out.println("Department : "+department);
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Manager m=new Manager("Abhishek", 22, "9146910339", "Baner", "Recruiting", "HR",50000);
        Employee e=new Employee("xyz", 23, "000000000", "Baner", "Software developer", "CSE",10000);

        m.display();
        m.printSalary();

        System.out.println();
        e.display();
        e.printSalary();
    }
}
