/**
 *  Class Members represent the information about the member.
 */
class Member{
    public String name;
    public int Age;
    public String phn_no;
    public String address;
    public int salary;
    /**
     * 
     * @param name represents the name of the member
     * @param age represents the age of the member
     * @param phn_no represents the phone number of the member
     * @param address represents the address of the member
     * @param salary represents the salary of the member
     */
    public Member(String name, int age, String phn_no, String address, int salary) {
        this.name = name;
        this.Age = age;
        this.phn_no = phn_no;
        this.address = address;
        this.salary = salary;
    }
    /**
     * Prints the salary of the member.
     */
    public void printSalary()
    {
        System.out.println("Salary of the member "+ name +" is "+ salary);
    }
}
/**
 * class Employee extends from the parent class (Member) having variable specialization 
 */
class Employee extends Member{   
    public String specialization; 
    /**
     *Constructor of the Employee class with some parameters
     * @param name represents the name of the employee
     * @param age represents the age of the employee
     * @param phn_no represents the phonenumber of the employee
     * @param address represents the address of the employee
     * @param salary represents the salary of the employee
     * @param specialization represents the specialization of the employee
     */
    public Employee(String name, int age, String phn_no, String address, int salary,String specialization) {
        super(name, age, phn_no, address, salary);
        this.specialization = specialization;
    }
}
/**
 * Class Manager extends from the class manager 
 */
class Manager extends Member{
    public String department;
    /**
     * Constructor of the Manager class with some properties
     * @param name  represents the name of the manager
     * @param age represents the age of the manager
     * @param phn_no represents the phone number of the manager
     * @param address represents the address of the manager
     * @param salary represents the salary of the manager
     * @param dept represents the dept of the manager
     */
    public Manager(String name, int age, String phn_no, String address, int salary, String dept) {
        super(name, age, phn_no, address, salary);
        department = dept; 
    }

}
public class Problem10 {
    public static void main(String[] args) {
        /**
         * Creating the Object of the Employee class with some perimeters
         */
        Employee employee = new Employee("Adhi",21,"9087643210","Pune",1000000,"CSE");
        /**
         * Creating the Object of the Manager class with some perimeters
         */
        Manager manager = new Manager("Gourav",35,"9084543210","J&K",5000000,"Production");
        /**
         * calling the printSalary mathod of the Employee class
         */
        employee.printSalary();
        /**
         * calling the printSalary mathod of the Manager class
         */
        manager.printSalary();
    }
}
