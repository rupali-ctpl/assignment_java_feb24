
public class ReverseNum {
    public static void main(String[] args) {
        int num=456;
        int reverse=0;
        
        System.out.println("Before reverse : "+num);
        while(num>0){
           reverse = reverse*10+(num%10);
           num/=10;
        }
        System.out.println("After reverse : "+reverse);
    }
}
