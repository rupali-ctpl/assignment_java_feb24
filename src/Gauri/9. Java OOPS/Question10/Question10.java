// class Member- 
class Member {
    // declaring data members
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    // parameterized constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // method to print the salary of the Member
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// class Employee extends the class Member
class Employee extends Member {
    // declaring data member
    private String specialization;
    // parameterized constructor 
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        // using super to call the parameterized constructor of the parent/ super class- Member
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    // overriding the toString method
    public String toString() {
        return "Employee Details:\nName: " + name + "\nAge: " + age + "\nPhone Number: " + phoneNumber + "\nAddress: "
                + address + "\nSalary: " + salary + "\nSpecialization: " + specialization;
    }
    
}

class Manager extends Member {
    // declaring data member
    private String department;
    
    // parameterized constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        // using super to call the parameterized constructor of the parent/ super class- Member
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    
    // overriding the toString method
    public String toString() {
        return "Employee Details:\nName: " + name + "\nAge: " + age + "\nPhone Number: " + phoneNumber + "\nAddress: "
                + address + "\nSalary: " + salary + "\nDepartment: " + department;
    }
    
}

public class Question10 {
    public static void main(String[] args) {
        // instantiating the object of Employee class with parameterized constructor
        Employee e1 = new Employee("John", 25, "123456789", "Pune", 20000, "Javascript");
        // instantiating the object of Manager class with parameterized constructor
        Manager m1 = new Manager("Alice", 30, "123456789", "Delhi", 50000, "HR");
        // printing the salarieds of Employee and Manager
        e1.printSalary();
        m1.printSalary();
        System.out.println(e1);
        System.out.println(m1);
    }
}
