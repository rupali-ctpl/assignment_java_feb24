import java.util.*;

public class char_present {
    public static void main(String[] args) {
         HashSet<Character> set = new HashSet<>();
         String s ="Umbrella";
         for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
         }

         if(set.contains('e')){
            System.out.println("e is present in the string "+s);
         }
         else{
            System.out.println("e is not present in the string "+s);
         }
    }
}
