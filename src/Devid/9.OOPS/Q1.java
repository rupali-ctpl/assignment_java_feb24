import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Area {
     public int length;
     public int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }

}

class Q1 {
    public static void main(String arg[]) {
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length and breadth");
        obj.length = sc.nextInt();
        obj.breadth = sc.nextInt();
        obj.setDim(obj.length, obj.breadth);
        System.out.println("Area of Rectangle is : "+obj.getArea());
    }
}