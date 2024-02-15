

public class Q3 {
    public static void main(String[] args) {
        String str="Umbrella";
        boolean flag=false;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                flag=true;
                break;
            }
        }
        if(!flag) System.out.println("Not present");
        else System.out.println("Present");

    }
}
