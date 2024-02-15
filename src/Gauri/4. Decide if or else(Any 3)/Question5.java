import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classesHeld = sc.nextInt();
        int classesAttended = sc.nextInt();
        sc.close();
        double percentage = ((double) classesAttended / (double) classesHeld)*100;
        System.out.println(percentage);
        if (percentage > 75) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
}
