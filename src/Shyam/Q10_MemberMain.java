public class Q10_MemberMain {

    public static class Member {

        String name;
        int age;
        int mobile;
        String address;
        int salary;

        Member(String name, int age, int mobile, String address, int salary) {
            this.name = name;
            this.age = age;
            this.mobile = mobile;
            this.address = address;
            this.salary = salary;
        }

        void printSalary() {
            System.out.println(salary);
        }
    }

    public static class Employee extends Member {

        String specialization;

        String Department;

        Employee(String name, int age, int mobile, String address, int salary, String specialization,
                String Department) {
            super(name, age, mobile, address, salary);
            this.Department = Department;
            this.specialization = specialization;
        }
    }

    public static class Manager extends Member {

        String specialization;

        String Department;

        Manager(String name, int age, int mobile, String address, int salary, String specialization,
                String Department) {
            super(name, age, mobile, address, salary);
            this.Department = Department;
            this.specialization = specialization;
        }

    }

    public static void main(String[] args) {

        Employee shyam = new Employee("shyam", 22, 123, "xyz", 30000, "Java", "Development");

        Manager m1 = new Manager("Rahul", 34, 123, "PQR", 70000, "Java", "Manager");

        shyam.printSalary();

        m1.printSalary();

    }

}
