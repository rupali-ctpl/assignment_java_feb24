package shreyashHake.question10;

public class Member {
    public String name;
    public int age;
    public String phoneNumber;
    public String address;
    public float salary;

    public Member(String name, int age, String phoneNumber, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.printf("Salary of %s is %f", this.name, this.salary);
    }
}

class Employee extends Member {
    public String specialization;

    public Employee(String name, int age, String phoneNumber, String address, float salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

}

class Manager extends Member {
    public String department;

    public Manager(String name, int age, String phoneNumber, String address, float salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

class Main {
    public static void main(String[] args) {
        Employee employeeInstance = new Employee("Jone done", 22, "1234567890", "Pune", 30000.f, "Java");
        System.out.println("Employee details : \n Name : " + employeeInstance.name + "\n Age : " + employeeInstance.age + "\n Phone number : " + employeeInstance.phoneNumber + "\n Address : " + employeeInstance.address + "\n Salary : " + employeeInstance.salary + "\n Specialization : " + employeeInstance.specialization);

        Manager managerInstance = new Manager("Michale Za", 42, "1234567890", "Pune", 300000.f, "AWS");
        System.out.println("\nManager details : \n Name : " + managerInstance.name + "\n Age : " + managerInstance.age + "\n Phone number : " + managerInstance.phoneNumber + "\n Address : " + managerInstance.address + "\n Salary : " + managerInstance.salary + "\n Specialization : " + managerInstance.department);

    }
}
