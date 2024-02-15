class Member{
    public String name;
    public int Age;
    public String phn_no;
    public String address;
    public int salary;

    public void printSalary()
    {
        System.out.println("Salary of the member "+ name +" is "+ salary);
    }


}
class Employee extends Member{
    public String specialization;
    public String dept;
    
}
class Manager extends Member{
    public String specialization;
    public String dept;
}

public class Problem10 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Adhi";
        employee.Age = 21;
        employee.phn_no = "9087643210";
        employee.salary = 1000000;
        employee.specialization = "PHD";
        employee.dept = "CSE";


        Manager manager = new Manager();
        manager.name = "Gourav";
        manager.Age = 35;
        manager.phn_no = "9084543210";
        manager.salary = 5000000;
        manager.specialization = "Masters ";
        manager.dept = "Production";

        employee.printSalary();
        manager.printSalary();

    }
}
