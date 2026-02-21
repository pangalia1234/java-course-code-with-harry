package chapter_04;
import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        int age;
        System.out.println("enter u r age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("u r exp");
        }
        else if (age>46){
            System.out.println("semi ex");
        } else if (age>36) {
            System.out.println("semi semi exp");
        }
        else {
            System.out.println("u r not exp");
        }
    }
}
