class Member{
    public String name;
    public int Age;
    public String phn_no;
    public String address;
    public int salary;
    // function to print salary
    public void printSalary()
    {
        System.out.println("Salary of the member "+ name +" is "+ salary);
    }
}
// Employee class extends class member 
class Employee extends Member{
    public String specialization1;
    public String department1;
}
// Manager class extends class member
class Manager extends Member{
    public String specialization2;
    public String department2;
}

public class Problem10 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Sneha";
        employee.Age = 21;
        employee.phn_no = "1234567895";
        employee.salary = 1000000;
        employee.specialization1 = "JAVA";
        employee.department1 = "CSE";

        Manager manager = new Manager();
        manager.name = "Nikita";
        manager.Age = 24;
        manager.phn_no = "8974563214";
        manager.salary = 5000000;
        manager.specialization2 = "C++ ";
        manager.department2 = "IT";

        employee.printSalary();
        manager.printSalary();
    }
}