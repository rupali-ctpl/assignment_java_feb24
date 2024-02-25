package Shrawani.OOP;

import javax.xml.namespace.QName;

class Member {
    //Data members
    private String name;
    private int age;
    private Long number;
    private String address;
    private Long salary;

    // Member Constructor
    public Member(String name, int age, Long number, String address, Long salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    void printSalary() {
        System.out.println("The salary of " + name + " is Rs." + salary);
    }

    // Display Member details
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

    // Employee constructor
    public Employee(String name, int age, Long number, String address, Long salary, String specialization) {
        super(name, age, number, address, salary);
        super.printSalary();
        this.specialization = specialization;
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    private String department;

    //Manager constructor
    public Manager(String name, int age, Long number, String address, Long salary, String department) {
        super(name, age, number, address, salary);
        super.printSalary();
        this.department = department;
        System.out.println("Department: " + department);
    }

}

public class Ten {
    public static void main(String[] args) {
        //Instances
        Employee e = new Employee("John", 21, 8432713596L, "Nanded", 1500000L, "Machine Learning");
        Manager m = new Manager("Siya", 21, 8432713596L, "Nanded", 1500000L, "Finance");
    }
}
