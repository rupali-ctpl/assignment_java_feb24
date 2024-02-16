public class problem10 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name ="abhi";
        e.age  = 21;
        e.ph_no ="9999999999";
        e.Address = "Ap-Chincholi, Tal Madha ";
        e.salary = 100000;

        Manager m = new Manager();
        m.name ="abhishek";
        m.age  = 22;
        m.ph_no ="9999999990";
        m.Address = "Ap-Chincholi, Tal Madha,Dist-Solapur ";
        m.salary = 100001;

        System.out.println("Employee data members are assigned as "+"name="+e.name+" "+"age="+e.age+" "+"ph_no="+e.ph_no+" "+"address="+e.Address+" "+"salary="+e.salary);
        System.out.println("Manager data members are assigned as "+"name="+m.name+" "+"age="+m.age+" "+"ph_no="+m.ph_no+" "+"address="+m.Address+" "+"salary="+m.salary);
    }
}

class Member{
    String name;
    int age;
    String ph_no;
    String Address;
    double salary;

    

    void printSalary(){
        System.out.println("salary is "+salary);
    }
}

class Employee extends Member{
    String specialization;

}

class Manager extends Member{
    String department;
}