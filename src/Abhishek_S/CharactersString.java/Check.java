
public class Check {
    public static void main(String[] args) {
        String str="Umbrella";
        boolean flag=false;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                flag=true;break;
            }
        }

        if(flag==true) System.out.println("Character is present");
        else System.out.println("character is not present");
    }
}
