public class power2 {
    public static void main(String[] args) {
        // Inbuilt functiom
        System.out.println(Math.pow(7, 5));

        /**
         * Loop using
         */
        int x = 7;
        int ans =1;
        for(int i = 0 ; i< 5; i++)
        {
            ans *= x;
        }
        System.out.println(ans);
    }
}
