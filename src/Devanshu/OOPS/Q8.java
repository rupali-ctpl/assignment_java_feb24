class Student{
    public Student(){
        System.out.println("Unknow");
    }

    public Student(String ...str) {
        
        for(var i:str){
            System.out.print(i+" ");
        }
    }

    
}

public class Q8 {
    public static void main(String[] args) {
        Student s=new Student("Devanshu","Devid","Abhi");

    }
}
