import java.util.*;
public class logic1 {

static void rotateArray(int a[]){
    int temp = a[4];
    for(int i = 5;i>0;i--){
      a[i] = a[i-1];
    }
     a[0] = temp;
    
  }
  static void print(int a[]){
    for(int i =0;i<5;i++){
     System.out.println(a[i]);
     }
  }
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    rotateArray(a);
    print(a);
  }
}
