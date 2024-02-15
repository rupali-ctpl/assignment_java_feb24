
class Student{
    private String name;
    private int roll_no;

    public void setName(String name){
         this.name=name;
    }
    public void setRollNo(int no){
        this.roll_no=no;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_no);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Student st=new Student();
        st.setName("John");
        st.setRollNo(2);

        st.display();
    }
}
