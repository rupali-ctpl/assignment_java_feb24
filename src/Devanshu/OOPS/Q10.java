class Member{
    String Name;
    int Age;
    String PhoneNo;
    String Address;
    double Salary;

    public void printSalary(){
        System.out.println("My salary is "+Salary);
    }

    public String toString(){
        return "Hello, I am " + Name + " I am " + Age + " year old and my phone number is " + PhoneNo+" and this is my address " + Address;
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

public class Q10 {
    public static void main(String[] args) {
        Employee e=new Employee();
        Manager m=new Manager();

        e.Name="Raj";
        e.Age=25;
        e.PhoneNo="1234";
        e.Address="Mumbai";
        System.out.println(e);
        e.Salary=80000;
        e.printSalary();
        System.out.println();

        m.Name="Navin";
        m.Age=30;
        m.PhoneNo="1234";
        m.Address="Delhi";
        m.Salary=120000;
        System.out.println(m);
        m.printSalary();



    }
}
