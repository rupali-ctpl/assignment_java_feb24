package Shrawani.OOP;

import javax.xml.namespace.QName;

class Member {
    private String name;
    private int age;
    private Long number;
    private String address;
    private Long salary;

    public Member(String name, int age, Long number, String address, Long salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("The salary of " + name + " is Rs." + salary);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

}

class Employee extends Member {
    private String specialization;


    public Employee(String name, int age, Long number, String address, Long salary, String specialization) {
        super(name, age, number, address, salary);
        super.printSalary();
        this.specialization = specialization;
        System.out.println("Specialization: " + specialization);
    }


}


class Manager extends Member {
    private String department;

    public Manager(String name, int age, Long number, String address, Long salary, String department) {
        super(name, age, number, address, salary);
        super.printSalary();
        this.department = department;
        System.out.println("Department: " + department);
    }

}

public class Ten {
    public static void main(String[] args) {

        Employee e = new Employee("John", 21, 8432713596L, "Nanded", 1500000L, "Machine Learning");
        Manager m = new Manager("Siya", 21, 8432713596L, "Nanded", 1500000L, "Finance");
    }
}
