class Member {
    public String name;
    public int age;
    public String phNo;
    public String address;
    public double salary;

    public Member(String name, int age, String phNo, String address, double salary) {
        this.salary = salary;
        this.phNo = phNo;
        this.address = address;
        this.salary = salary;
    }

    public double printSalary() {
        return salary;
    }

}

class Employee extends Member {
    public String specilization;
    public Employee(String name, int age, String phNo, String address, double salary){
        super(name, age, phNo, address, salary);
    }

}

class Manager extends Member {
    public String department;
    public Manager(String name, int age, String phNo, String address, double salary){
        super(name, age, phNo, address, salary);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Employee obj = new Employee("Rahul",18,"96868655487", "At - Pune",55000 );
        Manager obj1 = new Manager("Akshay",22,"9658655487", "At - Nagpur",90000 );
        System.out.println("Name "+ obj.name+"Phone No: "+obj.phNo+"Address: "+obj.address+"Salary: "+obj.salary);
        System.out.println("Name "+ obj1.name+"Phone No: "+obj1.phNo+"Address: "+obj1.address+"Salary: "+obj1.salary);
        
    }
}
