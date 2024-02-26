class Member {
    // Variables for storing the information
    public String name;
    public int age;
    public String phoneNo;
    public String address;
    public double salary;
    //Constructor with parameters
    public Member(String name, int age, String phoneNo, String address, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }
    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $ " + salary);
    }
}
    // Class Employee extending the properties of member class
class Employee extends Member {
    public String specilization;
    // Constructor with parameter for Employee class
    public Employee(String name, int age, String phoneNo, String address, double salary, String specilization) {
        super(name, age, phoneNo, address, salary);
        this.specilization = specilization;
    }
}
    // Class Manager extending the properties of member class
class Manager extends Member {
    public String department;
    // Constructor with parameter for Manager class
    public Manager(String name, int age, String phoneNo, String address, double salary, String department) {
        super(name, age, phoneNo, address, salary);
        this.department = department;
    }
}

public class Q10 {
    public static void main(String[] args) {
        // Creating the object for Employee and Manager class
        Employee employee = new Employee("Rahul Rane", 18, "96868655487", "At - Pune", 555000, "Software developer");
        Manager manager = new Manager("Akshay Gautam", 22, "9658655487", "At - Nagpur", 90000, "Computer Science");
        //Printing the results
        System.out.println("Name: " + employee.name + ", Phone No: " + employee.phoneNo + ", Address: "
                + employee.address + ", Salary: " + employee.salary + ", Specialization: " + employee.specilization);
        System.out.println("Name: " + manager.name + ", Phone No: " + manager.phoneNo + ", Address: " + manager.address
                + ", Salary: " + manager.salary + ", Department: " + manager.department);
    }
}
