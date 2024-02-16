class Member{
    String name;
    int age;
    double phn;
    String address;
    double salary;

    Member(String name,int age, double phn,String address, double salary){
      

        this.name=name;
        this.age=age;
        this.phn=phn;
        this.address=address;
      this.salary=salary;
    }
    public void printSalary(){
        System.out.println("Printing salary: "+salary);
    }

}

class Employee extends Member{
    Employee(String name,int age, double phn,String address,double salary) {
        super(name, age,phn,address,salary);
        
        
    }

    String special="Java";

  
    public String  toString(){
        return "name: "+name+" age: "+age+" phone number: "+phn+" Address: "+address+" salary: "+salary+" specialization: "+special;

    }

}

class Manager extends Member{
    Manager(String name,int age, double phn,String address,double salary) {
        super(name, age,phn,address,salary);
        
        
    }

    String dept="HR";

    
    public String  toString(){
        return "name: "+name+" age: "+age+" phone number: "+phn+" Address: "+address+" salary: "+salary+"department: "+dept;
        
    }

}


public class Problem10 {
    public static void main(String[] args) {
   


       Employee e1 = new Employee("sneha",12,123456,"latur",12345);
       e1.printSalary();
       System.out.println(e1.toString());
      

       Manager m1 = new Manager("Nikita", 25, 12365498, "pune", 52112);
       System.out.println(m1.toString());


        
    }
}
