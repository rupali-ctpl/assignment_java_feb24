// Class representing a member with common attributes
class Member {
    String name;
    int age;
    String phoneNo;
    String address;
    long salary;
    // Constructor to initialize member attributes
    Member(String name, int age, String phoneNo, String address, long salary) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }
    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
// Employee class extending Member with additional specialization attribute
class Employee extends Member {
    String specialization;
    // Constructor to initialize employee attributes
    Employee(String name, int age, String phoneNo, String address, String specialization, long salary) {
        super(name, age, phoneNo, address, salary);
        this.specialization = specialization;
    }
    // Method to display employee details
    public void display() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
    }
}
// Manager class extending Member with additional department attribute
class Manager extends Member {
    String department;
    // Constructor to initialize manager attributes
    Manager(String name, int age, String phoneNo, String address, String department, long salary) {
        super(name, age, phoneNo, address, salary);
        this.department = department;
    }
    // Method to display manager details
    public void display() {
        System.out.println("Manager Details: ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}
// Main class for solving Problem 10.
public class Problem10 {
    public static void main(String[] args) {
        Manager manager = new Manager("Abhishek", 22, "9146910339", "Baner", "HR", 50000);
        Employee employee = new Employee("xyz", 23, "000000000", "Baner", "Software developer", 10000);

        manager.display();
        manager.printSalary();
        employee.display();
        employee.printSalary();
    }
}
