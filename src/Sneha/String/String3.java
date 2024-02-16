public class String3 {
    public static void main(String[] args) {
        String str = "Umbrella";
        
        char[] c = str.toCharArray();

        for(int i=0;i<c.length;i++){
            if(str.charAt(i)=='e'){
                System.out.println("yes");
                break;
            }
           
        }
      
    }
}
