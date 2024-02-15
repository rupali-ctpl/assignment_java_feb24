package Shrawani.DataType;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Double d = sc.nextDouble();
        Double res = a.doubleValue() + d;
        System.out.println("The result is: " +res);

    }
}
