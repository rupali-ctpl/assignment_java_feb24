public class check7 {
    public static void main(String[] args) {
        String s = "Umbrella";
        // System.out.println(s.contains("e")); // Inbuilt
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                check = 1;
                break;
            }
        }
        if(check == 1) System.out.println("e is present");
        else System.out.println("e is not present");


    }
}
